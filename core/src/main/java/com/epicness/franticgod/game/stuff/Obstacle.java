package com.epicness.franticgod.game.stuff;

import static com.epicness.franticgod.game.GameConstants.GROUND_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.stuff.SpritedText;

public class Obstacle {

    private final SpritedText spritedText;
    private final char letter;
    private int durability;

    public Obstacle(Sprite sprite, BitmapFont font, char letter, Color color, int durability) {
        spritedText = new SpritedText(sprite, font);
        spritedText.setPosition(CAMERA_WIDTH, GROUND_HEIGHT);
        spritedText.setSize(100f);
        spritedText.setTextTargetWidth(100f);
        spritedText.setText(letter + "");
        spritedText.setBackgroundColor(color);
        this.letter = letter;
        this.durability = durability;
    }

    public void draw(SpriteBatch spriteBatch) {
        spritedText.draw(spriteBatch);
    }

    public float getX() {
        return spritedText.getX();
    }

    public void translateX(float amount) {
        spritedText.translateX(amount);
    }

    public char getLetter() {
        return letter;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}