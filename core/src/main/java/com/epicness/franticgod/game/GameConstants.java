package com.epicness.franticgod.game;

import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

public class GameConstants {

    private static final float GROUND_IMG_WIDTH = 1200;
    private static final float GROUND_IMG_HEIGHT = 70;
    private static final float GROUND_IMG_RATIO = GROUND_IMG_HEIGHT / GROUND_IMG_WIDTH;
    public static final float GROUND_WIDTH = CAMERA_WIDTH;
    public static final float GROUND_HEIGHT = GROUND_WIDTH * GROUND_IMG_RATIO;

    public static final float OBSTACLE_SPEED = -80f;

    public static final float RULE_DURATION = 14f;
}