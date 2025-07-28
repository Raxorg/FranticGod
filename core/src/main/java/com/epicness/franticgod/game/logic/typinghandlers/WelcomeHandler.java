package com.epicness.franticgod.game.logic.typinghandlers;

public class WelcomeHandler extends TypingHandler {

    @Override
    public void applyEffect() {
        stuff.getGodText().setText("Welcome!\nPress the upcoming keys");
    }

    @Override
    public void processKey(int keycode) {
        seekObstacle(keycode);
    }

    @Override
    public void endEffect() {

    }
}