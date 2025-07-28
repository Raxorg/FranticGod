package com.epicness.franticgod.game.logic.typinghandlers;

import com.badlogic.gdx.math.MathUtils;
import com.epicness.franticgod.game.logic.ObstacleSpawner;

public class RepetitionHandler extends TypingHandler {

    @Override
    public void applyEffect() {
        int repetitions = MathUtils.random(2, 4);
        switch (repetitions) {
            case 2:
                godText.setText("Press the keys twice!");
                break;
            case 3:
                godText.setText("Press the keys thrice!");
                break;
            case 4:
                godText.setText("Press the keys four times!");
                break;
        }
        logic.get(ObstacleSpawner.class).setInitialDurability(repetitions);
    }

    @Override
    public void processKey(int keycode) {
        seekObstacle(keycode);
    }

    @Override
    public void endEffect() {

    }
}