package com.epicness.franticgod.game.logic;

import static com.epicness.franticgod.game.GameConstants.OBSTACLE_SPEED;

import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.epicness.franticgod.game.stuff.Obstacle;

public class ObstacleMover extends GameLogicHandler {

    private DelayedRemovalArray<Obstacle> obstacles;
    private float speedMultiplier;

    @Override
    protected void init() {
        obstacles = stuff.getObstacles();
    }

    @Override
    protected void update(float delta) {
        Obstacle obstacle;
        for (int i = 0; i < obstacles.size; i++) {
            obstacle = obstacles.get(i);
            obstacle.translateX(OBSTACLE_SPEED * delta * speedMultiplier);
        }
    }

    public void setSpeedMultiplier(float speedMultiplier) {
        this.speedMultiplier = speedMultiplier;
    }
}