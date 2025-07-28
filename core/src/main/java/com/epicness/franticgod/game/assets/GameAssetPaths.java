package com.epicness.franticgod.game.assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.Sprite;

import java.util.ArrayList;
import java.util.List;

public class GameAssetPaths {

    public static final String ROOT = "franticgod";
    public static final List<AssetDescriptor<?>> ASSETS;

    public static final AssetDescriptor<Sprite[]> STICKMAN_RUN_ANIMATION;

    public static final AssetDescriptor<Sprite> GROUND_SPRITE;
    public static final AssetDescriptor<Sprite> BACKGROUND_SPRITE;
    public static final AssetDescriptor<Sprite> HUNGRY_OWL;

    public static final AssetDescriptor<Sound> BEEP_1_SOUND;
    public static final AssetDescriptor<Sound> MARIO_OOF_SOUND;
    public static final AssetDescriptor<Sound> TERRARIA_BEEP_1_SOUND;
    public static final AssetDescriptor<Sound> TERRARIA_BEEP_2_SOUND;
    public static final AssetDescriptor<Sound> TERRARIA_BEEP_3_SOUND;
    public static final AssetDescriptor<Sound> FINAL_LAP_SOUND;

    public static final AssetDescriptor<Music> ENERGETIC_MUSIC;
    public static final AssetDescriptor<Music> PHONK_MUSIC;
    public static final AssetDescriptor<Music> SPORT_MUSIC;
    public static final AssetDescriptor<Music> TECHNO_MUSIC;

    static {
        ASSETS = new ArrayList<>();

        ASSETS.add(STICKMAN_RUN_ANIMATION = descriptor("stickmanRunning.anim", Sprite[].class));

        ASSETS.add(GROUND_SPRITE = descriptor("ground.png", Sprite.class));
        ASSETS.add(BACKGROUND_SPRITE = descriptor("background.png", Sprite.class));
        ASSETS.add(HUNGRY_OWL = descriptor("hungryOwl.png", Sprite.class));

        ASSETS.add(BEEP_1_SOUND = descriptor("beep1.swav", Sound.class));
        ASSETS.add(MARIO_OOF_SOUND = descriptor("marioOof.swav", Sound.class));
        ASSETS.add(TERRARIA_BEEP_1_SOUND = descriptor("terrariaBeep1.sogg", Sound.class));
        ASSETS.add(TERRARIA_BEEP_2_SOUND = descriptor("terrariaBeep2.sogg", Sound.class));
        ASSETS.add(TERRARIA_BEEP_3_SOUND = descriptor("terrariaBeep3.sogg", Sound.class));
        ASSETS.add(FINAL_LAP_SOUND = descriptor("finalLap.swav", Sound.class));

        ASSETS.add(ENERGETIC_MUSIC = descriptor("energetic.mogg", Music.class));
        ASSETS.add(PHONK_MUSIC = descriptor("phonk.mogg", Music.class));
        ASSETS.add(SPORT_MUSIC = descriptor("sport.mogg", Music.class));
        ASSETS.add(TECHNO_MUSIC = descriptor("techno.mogg", Music.class));
    }

    private static <T> AssetDescriptor<T> descriptor(String path, Class<T> assetClass) {
        switch (assetClass.getSimpleName()) {
            case "Sprite[]":
                return new AssetDescriptor<>(ROOT + "/animations/" + path, assetClass);
            case "Sprite":
            case "Texture":
                return new AssetDescriptor<>(ROOT + "/images/" + path, assetClass);
            case "Music":
            case "Sound":
            default:
                return new AssetDescriptor<>(ROOT + "/audios/" + path, assetClass);
        }
    }
}