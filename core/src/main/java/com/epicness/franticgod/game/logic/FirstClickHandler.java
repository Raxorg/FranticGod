package com.epicness.franticgod.game.logic;

import static com.badlogic.gdx.graphics.Color.CLEAR;
import static com.badlogic.gdx.graphics.Color.WHITE;
import static com.epicness.fundamentals.constants.SharedConstants.BLACK_CLEAR_75;

import com.epicness.franticgod.game.logic.typinghandlers.TypingRedirector;
import com.epicness.franticgod.game.logic.typinghandlers.WelcomeHandler;
import com.epicness.fundamentals.stuff.SpritedText;

public class FirstClickHandler extends GameLogicHandler {

    private SpritedText clickMessage;
    private boolean started;

    @Override
    protected void init() {
        clickMessage = stuff.getClickMessage();
        clickMessage.setBackgroundColor(BLACK_CLEAR_75);
        clickMessage.setTextColor(WHITE);
        stuff.getGodText().setText("");
        started = false;
    }

    @Override
    public void touchDown(float x, float y, int button) {
        if (started) return;

        clickMessage.setBackgroundColor(CLEAR);
        clickMessage.setTextColor(CLEAR);
        logic.get(GodTimerHandler.class).enable();
        logic.get(MusicHandler.class).playRandomMusic();
        logic.get(ObstacleSpawner.class).enable();
        logic.get(TypingRedirector.class).useRule(logic.get(WelcomeHandler.class));
        started = true;
    }
}