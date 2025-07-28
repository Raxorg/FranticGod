package com.epicness.franticgod.game.logic;

import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HALF_WIDTH;

import com.epicness.fundamentals.stuff.Text;

public class ScoreHandler extends GameLogicHandler {

    private Text scoreText;
    private int score;
    private float speedMultiplier;

    @Override
    protected void init() {
        scoreText = stuff.getScore();
        scoreText.setText("Score: 0");
        score = 0;
    }

    public void earnPoints() {
        score += 10 * speedMultiplier;
        scoreText.setText("Score: " + score);
        if (score >= 2000) {
            stuff.getHungryOwl().setX(CAMERA_HALF_WIDTH - 150f);
        }
    }

    public void setSpeedMultiplier(float speedMultiplier) {
        this.speedMultiplier = speedMultiplier;
    }

    public int getScore() {
        return score;
    }
}