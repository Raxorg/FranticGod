package com.epicness.franticgod.game.logic;

import com.epicness.fundamentals.logic.behaviors.AnimationUpdater;

public class StickmanHandler extends GameLogicHandler {

    private AnimationUpdater animationUpdater;
    private float speedMultiplier;

    @Override
    protected void init() {
        animationUpdater = new AnimationUpdater();
        animationUpdater.setAnimation(stuff.getStickman().getAnimation());
    }

    @Override
    protected void update(float delta) {
        animationUpdater.update(delta * speedMultiplier);
    }

    public void setSpeedMultiplier(float speedMultiplier) {
        this.speedMultiplier = speedMultiplier;
    }
}