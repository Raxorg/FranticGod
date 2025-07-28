package com.epicness.franticgod.game.logic;

import static com.badlogic.gdx.graphics.Color.RED;
import static com.badlogic.gdx.graphics.Color.WHITE;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.epicness.franticgod.game.stuff.Obstacle;
import com.epicness.franticgod.game.stuff.Stickman;

public class CollisionHandler extends GameLogicHandler {

    private DelayedRemovalArray<Obstacle> obstacles;
    private Stickman stickman;
    private boolean animatingDamage;
    private float damageFadeProgress;
    private Color stickmanColor, damageColor;

    @Override
    protected void init() {
        obstacles = stuff.getObstacles();
        stickman = stuff.getStickman();
        animatingDamage = false;
        damageFadeProgress = 1f;
        stickmanColor = new Color();
        damageColor = RED.cpy();
    }

    @Override
    protected void update(float delta) {
        calculateCollisions();
        animateDamage(delta);
    }

    private void calculateCollisions() {
        Obstacle obstacle;
        obstacles.begin();
        for (int i = 0; i < obstacles.size; i++) {
            obstacle = obstacles.get(i);
            if (obstacle.getX() <= stickman.getX() + stickman.getWidth()) {
                takeDamage();
                obstacles.removeValue(obstacle, true);
                break;
            }
        }
        obstacles.end();
    }

    private void takeDamage() {
        stickmanColor.set(RED);
        stickman.setColor(RED);
        animatingDamage = true;
        damageFadeProgress = 0f;
        logic.get(LivesHandler.class).loseLife();
        assets.getMarioOof().play();
    }

    private void animateDamage(float delta) {
        if (!animatingDamage) return;

        stickman.setColor(stickmanColor.set(damageColor.lerp(WHITE, damageFadeProgress)));
        damageColor.set(RED);
        damageFadeProgress = Math.min(damageFadeProgress + delta, 1f);
        if (damageFadeProgress == 1f) {
            animatingDamage = false;
        }
    }
}