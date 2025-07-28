package com.epicness.franticgod.game;

import com.epicness.franticgod.game.stuff.GameStuff;
import com.epicness.fundamentals.renderer.Renderer;

public class GameRenderer extends Renderer<GameStuff> {

    @Override
    public void render() {
        spriteBatch.begin();
        stuff.getBackground().draw(spriteBatch);
        stuff.getGround1().draw(spriteBatch);
        stuff.getGround2().draw(spriteBatch);
        stuff.getStickman().draw(spriteBatch);
        for (int i = 0; i < stuff.getObstacles().size; i++) {
            stuff.getObstacles().get(i).draw(spriteBatch);
        }
        stuff.getGodText().draw(spriteBatch);
        stuff.getIntercalatedKey().draw(spriteBatch);
        stuff.getGodBar().draw(spriteBatch);
        stuff.getScore().draw(spriteBatch);
        stuff.getGameOverMessage().draw(spriteBatch);
        stuff.getClickMessage().draw(spriteBatch);
        stuff.getHungryOwl().draw(spriteBatch);
        spriteBatch.end();
    }
}