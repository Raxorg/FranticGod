package com.epicness.franticgod.game.logic;

import static com.epicness.franticgod.game.GameConstants.RULE_DURATION;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.math.MathUtils;
import com.epicness.franticgod.game.logic.typinghandlers.TypingRedirector;

public class GodTimerHandler extends GameLogicHandler {

    private float time;
    private boolean enabled;

    @Override
    protected void init() {
        time = 0f;
        enabled = false;
    }

    @Override
    protected void update(float delta) {
        if (!enabled) return;

        time = Math.min(time + delta, RULE_DURATION);
        stuff.getGodBar().setWidth(MathUtils.map(0f, RULE_DURATION, CAMERA_WIDTH, 0f, time));
        if (time == RULE_DURATION) {
            logic.get(TypingRedirector.class).randomizeRule();
            logic.get(SpeedHandler.class).increaseSpeed();
            time = 0f;
        }
    }

    public void enable() {
        enabled = true;
    }

    public void disable() {
        enabled = false;
    }
}