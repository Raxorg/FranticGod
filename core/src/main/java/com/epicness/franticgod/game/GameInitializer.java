package com.epicness.franticgod.game;

import com.epicness.franticgod.game.assets.GameAssets;
import com.epicness.franticgod.game.logic.GameLogic;
import com.epicness.franticgod.game.stuff.GameStuff;
import com.epicness.fundamentals.initializer.Initializer;

public class GameInitializer extends Initializer<GameAssets, GameRenderer, GameStuff> {

    public GameInitializer(GameAssets assets) {
        super(assets, new GameLogic(), new GameRenderer(), new GameStuff());
    }
}