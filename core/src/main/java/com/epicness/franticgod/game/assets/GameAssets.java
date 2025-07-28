package com.epicness.franticgod.game.assets;

import static com.epicness.franticgod.game.assets.GameAssetPaths.ASSETS;
import static com.epicness.franticgod.game.assets.GameAssetPaths.BACKGROUND_SPRITE;
import static com.epicness.franticgod.game.assets.GameAssetPaths.BEEP_1_SOUND;
import static com.epicness.franticgod.game.assets.GameAssetPaths.ENERGETIC_MUSIC;
import static com.epicness.franticgod.game.assets.GameAssetPaths.FINAL_LAP_SOUND;
import static com.epicness.franticgod.game.assets.GameAssetPaths.GROUND_SPRITE;
import static com.epicness.franticgod.game.assets.GameAssetPaths.HUNGRY_OWL;
import static com.epicness.franticgod.game.assets.GameAssetPaths.MARIO_OOF_SOUND;
import static com.epicness.franticgod.game.assets.GameAssetPaths.PHONK_MUSIC;
import static com.epicness.franticgod.game.assets.GameAssetPaths.SPORT_MUSIC;
import static com.epicness.franticgod.game.assets.GameAssetPaths.STICKMAN_RUN_ANIMATION;
import static com.epicness.franticgod.game.assets.GameAssetPaths.TECHNO_MUSIC;
import static com.epicness.franticgod.game.assets.GameAssetPaths.TERRARIA_BEEP_1_SOUND;
import static com.epicness.franticgod.game.assets.GameAssetPaths.TERRARIA_BEEP_2_SOUND;
import static com.epicness.franticgod.game.assets.GameAssetPaths.TERRARIA_BEEP_3_SOUND;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.epicness.fundamentals.assets.Assets;

public class GameAssets extends Assets {

    private Sprite[] stickmanRunningFrames;
    private Sprite ground, background, hungryOwl;
    private Music energetic, phonk, sport, techno;
    private Sound beep1, beep2, beep3, menuBeep, marioOof, finalLap;

    public GameAssets() {
        super(ASSETS);
    }

    @Override
    protected void initializeAssets() {
        stickmanRunningFrames = get(STICKMAN_RUN_ANIMATION);
        ground = get(GROUND_SPRITE);
        background = get(BACKGROUND_SPRITE);
        hungryOwl = get(HUNGRY_OWL);

        energetic = get(ENERGETIC_MUSIC);
        phonk = get(PHONK_MUSIC);
        sport = get(SPORT_MUSIC);
        techno = get(TECHNO_MUSIC);

        beep1 = get(TERRARIA_BEEP_1_SOUND);
        beep2 = get(TERRARIA_BEEP_2_SOUND);
        beep3 = get(TERRARIA_BEEP_3_SOUND);
        menuBeep = get(BEEP_1_SOUND);
        marioOof = get(MARIO_OOF_SOUND);
        finalLap = get(FINAL_LAP_SOUND);
    }

    public Sprite[] getStickmanRunningFrames() {
        return stickmanRunningFrames;
    }

    public Sprite getGround() {
        return ground;
    }

    public Sprite getBackground() {
        return background;
    }

    public Sprite getHungryOwl() {
        return hungryOwl;
    }

    public Music getEnergetic() {
        return energetic;
    }

    public Music getPhonk() {
        return phonk;
    }

    public Music getSport() {
        return sport;
    }

    public Music getTechno() {
        return techno;
    }

    public Sound getBeep1() {
        return beep1;
    }

    public Sound getBeep2() {
        return beep2;
    }

    public Sound getBeep3() {
        return beep3;
    }

    public Sound getMenuBeep() {
        return menuBeep;
    }

    public Sound getMarioOof() {
        return marioOof;
    }

    public Sound getFinalLap() {
        return finalLap;
    }
}