package com.epicness.franticgod.game.logic.typinghandlers;

import com.badlogic.gdx.math.MathUtils;
import com.epicness.franticgod.game.logic.GameLogicHandler;

public class TypingRedirector extends GameLogicHandler {

    private TypingHandler typingHandler;

    @Override
    protected void init() {
        typingHandler = null;
    }

    @Override
    public void keyDown(int keycode) {
        keycode += 36;
        if (typingHandler != null) typingHandler.processKey(keycode);
    }

    public void randomizeRule() {
        boolean random = MathUtils.randomBoolean(0.25f);
        if (random) {
            useRule(logic.get(IntercalatedHandler.class));
        } else {
            useRule(logic.get(RepetitionHandler.class));
        }
    }

    public void useRule(TypingHandler newTypingHandler) {
        if (typingHandler != null) {
            typingHandler.endEffect();
            assets.getFinalLap().play();
        }
        typingHandler = newTypingHandler;
        typingHandler.applyEffect();
    }
}