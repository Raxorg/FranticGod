package com.epicness.franticgod.game.logic;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.math.MathUtils;

public class MusicHandler extends GameLogicHandler {

    private float timer;
    private int song;
    private Music energetic, phonk, sport, techno;
    public boolean enabled;

    @Override
    protected void init() {
        energetic = assets.getEnergetic();
        phonk = assets.getPhonk();
        sport = assets.getSport();
        techno = assets.getTechno();

        energetic.setVolume(0.27f);
        phonk.setVolume(0.27f);
        sport.setVolume(0.27f);
        techno.setVolume(0.27f);

        song = 0;
        timer = 0f;
    }

    public void playRandomMusic() {
        if (energetic.isPlaying() || phonk.isPlaying() || sport.isPlaying() || techno.isPlaying()) return;

        int newSong;
        do {
            newSong = MathUtils.random(1, 4);
        } while (newSong == song);
        switch (newSong) {
            case 1:
                energetic.play();
                break;
            case 2:
                phonk.play();
                break;
            case 3:
                sport.play();
                break;
            case 4:
                techno.play();
                break;
        }
        song = newSong;
        enabled = true;
    }

    @Override
    protected void update(float delta) {
        if (!enabled) return;

        if (!energetic.isPlaying() && !phonk.isPlaying() && !sport.isPlaying() && !techno.isPlaying()) {
            timer += delta;
            if (timer >= 15f) {
                playRandomMusic();
                timer = 0f;
            }
        }
    }
}