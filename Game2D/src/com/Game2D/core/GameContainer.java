package com.Game2D.core;

import com.Game2D.core.screens.SplashScreen;
import com.Game2D.core.sound.SoundHandler;

import com.badlogic.gdx.Game;

public class GameContainer extends Game {

	@Override
	public void create() {
		SoundHandler.initSounds();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		SoundHandler.destroy();
		super.dispose();
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void resume() {
		super.resume();
	}

}
