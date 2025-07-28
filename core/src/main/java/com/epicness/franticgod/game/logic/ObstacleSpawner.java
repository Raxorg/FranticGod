package com.epicness.franticgod.game.logic;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.epicness.franticgod.game.stuff.Obstacle;
import com.epicness.fundamentals.utils.Random;

public class ObstacleSpawner extends GameLogicHandler {

    private DelayedRemovalArray<Obstacle> obstacles;
    private float timer;
    private boolean enabled;
    private int initialDurability;
    private float speedMultiplier;

    @Override
    protected void init() {
        obstacles = stuff.getObstacles();
        timer = 0f;
        enabled = false;
        sharedAssets.getPixelFont().getData().setScale(5f);
        initialDurability = 1;
        speedMultiplier = 1f;
    }

    @Override
    protected void update(float delta) {
        if (!enabled) return;

        timer += delta;
        if (timer >= Math.max(0.9f, 2.9f - (speedMultiplier))) {
            Obstacle obstacle = new Obstacle(
                sharedAssets.getSquare32(),
                sharedAssets.getPixelFont(),
                (char) MathUtils.random(65, 90),
                Random.rainbowColor(),
                initialDurability
            );
            obstacles.add(obstacle);
            timer = 0f;
        }
    }

    public void enable() {
        enabled = true;
    }

    public void disable() {
        enabled = false;
    }

    public void setInitialDurability(int initialDurability) {
        this.initialDurability = initialDurability;
    }

    public void setSpeedMultiplier(float speedMultiplier) {
        this.speedMultiplier = speedMultiplier;
    }
}