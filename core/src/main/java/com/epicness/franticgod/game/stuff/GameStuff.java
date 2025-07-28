package com.epicness.franticgod.game.stuff;

import static com.badlogic.gdx.graphics.Color.GREEN;
import static com.epicness.franticgod.game.GameConstants.GROUND_HEIGHT;
import static com.epicness.franticgod.game.GameConstants.GROUND_WIDTH;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HALF_WIDTH;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.epicness.franticgod.game.assets.GameAssets;
import com.epicness.fundamentals.stuff.Sprited;
import com.epicness.fundamentals.stuff.SpritedText;
import com.epicness.fundamentals.stuff.Stuff;
import com.epicness.fundamentals.stuff.Text;

public class GameStuff extends Stuff<GameAssets> {

    private Sprite background;
    private Sprite ground1, ground2;
    private Stickman stickman;
    private DelayedRemovalArray<Obstacle> obstacles;
    private Text godText;
    private SpritedText intercalatedKey;
    private Sprited godBar;
    private Text score;
    private SpritedText gameOverMessage;
    private SpritedText clickMessage;
    private Sprited hungryOwl;

    @Override
    public void initializeStuff() {
        background = new Sprite(assets.getBackground());
        background.setSize(CAMERA_WIDTH, CAMERA_HEIGHT);

        ground1 = new Sprite(assets.getGround());
        ground1.setSize(GROUND_WIDTH, GROUND_HEIGHT);

        ground2 = new Sprite(assets.getGround());
        ground2.setSize(GROUND_WIDTH, GROUND_HEIGHT);
        ground2.setX(GROUND_WIDTH);

        stickman = new Stickman(assets.getStickmanRunningFrames());

        obstacles = new DelayedRemovalArray<>();

        godText = new Text(sharedAssets.getPixelFont());
        godText.setTextTargetWidth(CAMERA_WIDTH);
        godText.setCenterVertical(true);
        godText.setY(CAMERA_HEIGHT * 0.5f);
        godText.setHorizontalAlignment(Align.center);

        intercalatedKey = new SpritedText(sharedAssets.getSquare32(), sharedAssets.getPixelFont());
        intercalatedKey.setSize(100f);
        intercalatedKey.setPosition(CAMERA_HALF_WIDTH - 50f, CAMERA_HEIGHT * 0.35f);
        intercalatedKey.setTextTargetWidth(100f);

        godBar = new Sprited(sharedAssets.getPixel());
        godBar.setY(CAMERA_HEIGHT - 20f);
        godBar.setHeight(20f);
        godBar.setWidth(CAMERA_WIDTH);
        godBar.setColor(GREEN);

        score = new Text(sharedAssets.getPixelFont());
        score.setCenterVertical(true);
        score.setTextTargetWidth(CAMERA_WIDTH);
        score.setHorizontalAlignment(Align.center);
        score.setY(43f);

        gameOverMessage = new SpritedText(sharedAssets.getPixel(), sharedAssets.getTimesSquare());
        gameOverMessage.setSize(CAMERA_WIDTH, CAMERA_HEIGHT);
        gameOverMessage.setTextTargetWidth(CAMERA_WIDTH);
        gameOverMessage.setText("Game over!\nPress 0 to restart");

        clickMessage = new SpritedText(sharedAssets.getPixel(), sharedAssets.getTimesSquare());
        clickMessage.setSize(CAMERA_WIDTH, CAMERA_HEIGHT);
        clickMessage.setTextTargetWidth(CAMERA_WIDTH);
        clickMessage.setText("Click to begin");

        hungryOwl = new Sprited(assets.getHungryOwl());
        hungryOwl.setPosition(CAMERA_WIDTH, CAMERA_HEIGHT - 370f);
        hungryOwl.setSize(300f);
    }

    public Sprite getBackground() {
        return background;
    }

    public Sprite getGround1() {
        return ground1;
    }

    public Sprite getGround2() {
        return ground2;
    }

    public Stickman getStickman() {
        return stickman;
    }

    public DelayedRemovalArray<Obstacle> getObstacles() {
        return obstacles;
    }

    public Text getGodText() {
        return godText;
    }

    public SpritedText getIntercalatedKey() {
        return intercalatedKey;
    }

    public Sprited getGodBar() {
        return godBar;
    }

    public Text getScore() {
        return score;
    }

    public SpritedText getGameOverMessage() {
        return gameOverMessage;
    }

    public SpritedText getClickMessage() {
        return clickMessage;
    }

    public Sprited getHungryOwl() {
        return hungryOwl;
    }
}