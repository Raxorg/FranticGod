package com.epicness.franticgod.game.logic.typinghandlers;

import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.epicness.franticgod.game.logic.GameLogicHandler;
import com.epicness.franticgod.game.logic.ObstacleDamager;
import com.epicness.franticgod.game.stuff.Obstacle;
import com.epicness.fundamentals.stuff.Text;

public abstract class TypingHandler extends GameLogicHandler {

    protected DelayedRemovalArray<Obstacle> obstacles;
    protected Text godText;

    @Override
    protected void init() {
        obstacles = stuff.getObstacles();
        godText = stuff.getGodText();
    }

    public abstract void applyEffect();

    public abstract void processKey(int keycode);

    public abstract void endEffect();

    protected final void seekObstacle(int keycode) {
        Obstacle obstacle;
        obstacles.begin();
        for (int i = 0; i < obstacles.size; i++) {
            obstacle = obstacles.get(i);

            if (obstacle.getLetter() != keycode) continue;

            logic.get(ObstacleDamager.class).damageObstacle(obstacle);
            break;
        }
        obstacles.end();
    }
}