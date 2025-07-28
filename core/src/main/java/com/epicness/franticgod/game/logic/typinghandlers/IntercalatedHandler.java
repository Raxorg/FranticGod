package com.epicness.franticgod.game.logic.typinghandlers;

import static com.badlogic.gdx.graphics.Color.CLEAR;
import static com.badlogic.gdx.graphics.Color.WHITE;
import static com.epicness.fundamentals.constants.SharedConstants.GRASS;

import com.badlogic.gdx.math.MathUtils;
import com.epicness.franticgod.game.logic.ObstacleSpawner;
import com.epicness.fundamentals.stuff.SpritedText;

public class IntercalatedHandler extends TypingHandler {

    private SpritedText intercalatedKey;
    private boolean targetKeyPressed;
    private int targetKey;

    @Override
    protected void init() {
        super.init();
        intercalatedKey = stuff.getIntercalatedKey();
        intercalatedKey.setBackgroundColor(CLEAR);
        intercalatedKey.setTextColor(CLEAR);
    }

    @Override
    public void applyEffect() {
        targetKey = MathUtils.random(44, 52);
        intercalatedKey.setBackgroundColor(WHITE);
        intercalatedKey.setTextColor(WHITE);
        intercalatedKey.setText((targetKey - 43) + "");
        logic.get(ObstacleSpawner.class).setInitialDurability(1);
        targetKeyPressed = false;
        godText.setText("Press the shown key between ket presses!");
    }

    @Override
    public void processKey(int keycode) {
        if (targetKeyPressed) {
            seekObstacle(keycode);
        }

        targetKeyPressed = targetKey == keycode;
        intercalatedKey.setBackgroundColor(targetKeyPressed ? GRASS : WHITE);
    }

    @Override
    public void endEffect() {
        stuff.getIntercalatedKey().setBackgroundColor(CLEAR);
        stuff.getIntercalatedKey().setTextColor(CLEAR);
    }
}