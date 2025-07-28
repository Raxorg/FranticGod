package com.epicness.franticgod.game.logic;

public class SpeedHandler extends GameLogicHandler {

    private float speedMultiplier;

    @Override
    protected void init() {
        speedMultiplier = 1f;
        updateSpeed();
    }

    public void increaseSpeed() {
        speedMultiplier += 0.2f;
        updateSpeed();
    }

    private void updateSpeed() {
        logic.get(GroundHandler.class).setSpeedMultiplier(speedMultiplier);
        logic.get(ObstacleMover.class).setSpeedMultiplier(speedMultiplier);
        logic.get(ObstacleSpawner.class).setSpeedMultiplier(speedMultiplier);
        logic.get(ScoreHandler.class).setSpeedMultiplier(speedMultiplier);
        logic.get(StickmanHandler.class).setSpeedMultiplier(speedMultiplier);
    }
}