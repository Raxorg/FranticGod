package com.epicness.franticgod.game.logic;

import com.epicness.franticgod.game.logic.typinghandlers.IntercalatedHandler;
import com.epicness.franticgod.game.logic.typinghandlers.RepetitionHandler;
import com.epicness.franticgod.game.logic.typinghandlers.TypingRedirector;
import com.epicness.franticgod.game.logic.typinghandlers.WelcomeHandler;
import com.epicness.fundamentals.logic.Logic;

public class GameLogic extends Logic {

    private final CollisionHandler collisionHandler;
    private final GodTimerHandler godTimerHandler;
    private final GroundHandler groundHandler;
    private final LivesHandler livesHandler;
    private final MusicHandler musicHandler;
    private final ObstacleMover obstacleMover;
    private final ObstacleSpawner obstacleSpawner;
    private final StickmanHandler stickmanHandler;

    public GameLogic() {
        registerHandler(collisionHandler = new CollisionHandler());
        registerHandler(new FirstClickHandler());
        registerHandler(godTimerHandler = new GodTimerHandler());
        registerHandler(groundHandler = new GroundHandler());
        registerHandler(livesHandler = new LivesHandler());
        registerHandler(musicHandler = new MusicHandler());
        registerHandler(new ObstacleDamager());
        registerHandler(obstacleMover = new ObstacleMover());
        registerHandler(obstacleSpawner = new ObstacleSpawner());
        registerHandler(new ScoreHandler());
        registerHandler(new SpeedHandler());
        registerHandler(stickmanHandler = new StickmanHandler());
        // Typing handlers
        registerHandler(new IntercalatedHandler());
        registerHandler(new RepetitionHandler());
        registerHandler(new TypingRedirector());
        registerHandler(new WelcomeHandler());
    }

    @Override
    public void update() {
        collisionHandler.update();
        godTimerHandler.update();
        groundHandler.update();
        livesHandler.update();
        musicHandler.update();
        obstacleMover.update();
        obstacleMover.update();
        obstacleSpawner.update();
        stickmanHandler.update();
    }
}