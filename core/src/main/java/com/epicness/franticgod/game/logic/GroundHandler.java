package com.epicness.franticgod.game.logic;

import static com.epicness.franticgod.game.GameConstants.GROUND_WIDTH;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class GroundHandler extends GameLogicHandler {

    private Sprite ground1, ground2;
    private float groundSpeed, speedMultiplier;

    @Override
    protected void init() {
        ground1 = stuff.getGround1();
        ground2 = stuff.getGround2();
        groundSpeed = -100f;
    }

    @Override
    protected void update(float delta) {
        moveGround(ground1, delta * speedMultiplier);
        moveGround(ground2, delta * speedMultiplier);
    }

    private void moveGround(Sprite ground, float delta) {
        ground.translateX(delta * groundSpeed);
        if (ground.getX() + GROUND_WIDTH <= 0f) {
            ground.translateX(GROUND_WIDTH * 2f);
        }
    }

    public void setSpeedMultiplier(float speedMultiplier) {
        this.speedMultiplier = speedMultiplier;
    }
}