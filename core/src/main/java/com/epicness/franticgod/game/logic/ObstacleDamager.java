package com.epicness.franticgod.game.logic;

import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.epicness.franticgod.game.stuff.Obstacle;

public class ObstacleDamager extends GameLogicHandler {

    private DelayedRemovalArray<Obstacle> obstacles;

    @Override
    protected void init() {
        obstacles = stuff.getObstacles();
    }

    public void damageObstacle(Obstacle obstacle) {
        obstacle.setDurability(obstacle.getDurability() - 1);

        switch (obstacle.getDurability()) {
            case 0:
                assets.getBeep1().play();
                break;
            case 1:
                assets.getBeep2().play();
                break;
            case 2:
                assets.getBeep3().play();
                break;
            case 3:
                assets.getBeep3().setPitch(assets.getBeep3().play(), 0.7f);
                break;
        }

        if (obstacle.getDurability() == 0) {
            obstacles.removeValue(obstacle, true);
            logic.get(ScoreHandler.class).earnPoints();
        }
    }
}