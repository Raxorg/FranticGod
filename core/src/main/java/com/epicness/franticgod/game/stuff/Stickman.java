package com.epicness.franticgod.game.stuff;

import static com.epicness.franticgod.game.GameConstants.GROUND_HEIGHT;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.stuff.SpritedAnimation;

public class Stickman {

    private final SpritedAnimation animation;
    private int lives;

    public Stickman(Sprite[] animationFrames) {
        animation = new SpritedAnimation(1f / 15f, animationFrames);
        animation.useBilinearFilter();
        animation.enableLooping();
        animation.setPosition(50f, GROUND_HEIGHT);
    }

    public void draw(SpriteBatch spriteBatch) {
        animation.draw(spriteBatch);
    }

    public float getX() {
        return animation.getX();
    }

    public float getWidth() {
        return animation.getWidth();
    }

    public void setColor(Color color) {
        animation.setColor(color);
    }

    public SpritedAnimation getAnimation() {
        return animation;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}