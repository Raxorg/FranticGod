package com.epicness.franticgod.game.logic;

import static com.badlogic.gdx.graphics.Color.CLEAR;
import static com.badlogic.gdx.graphics.Color.WHITE;
import static com.epicness.fundamentals.constants.SharedConstants.BLACK_CLEAR_75;

import com.badlogic.gdx.Input;
import com.epicness.fundamentals.stuff.SpritedText;

public class LivesHandler extends GameLogicHandler {

    private SpritedText gameOverMessage;
    private boolean gameOver;

    @Override
    protected void init() {
        gameOver = false;
        gameOverMessage = stuff.getGameOverMessage();
        gameOverMessage.setBackgroundColor(CLEAR);
        gameOverMessage.setTextColor(CLEAR);
    }

    public void loseLife() {
        gameOver = true;
        gameOverMessage.setBackgroundColor(BLACK_CLEAR_75);
        gameOverMessage.setTextColor(WHITE);
        if (logic.get(ScoreHandler.class).getScore() >= 2000) {
            gameOverMessage.setText("You defeated god!\nHe is hungry btw\nPress 0 to restart");
        }
        stuff.getObstacles().clear();
        logic.get(ObstacleSpawner.class).disable();
        logic.get(GodTimerHandler.class).disable();
        stuff.getGodText().setColor(CLEAR);
    }

    @Override
    public void keyDown(int keycode) {
        if (!gameOver) return;

        if (keycode == Input.Keys.NUM_0)
            logic.initialLogic();
    }
}