package com.epicness.franticgod;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.franticgod.game.GameInitializer;
import com.epicness.franticgod.game.assets.GameAssets;
import com.epicness.fundamentals.SharedResources;
import com.retmode.texel.TexelBatchProvider;
import com.retmode.texel.TexelBatchSingleton;

public class FranticGodGame extends Game {

    @Override
    public void create() {
        GameAssets assets = new GameAssets();
        assets.queueAssetLoading();
        assets.finishLoading();
        assets.initAssets();
        new GameInitializer(assets).initialize(new SharedResources());
    }
}