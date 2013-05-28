package com.Game2D.core;

import com.badlogic.gdx.Game;

public class GameMain extends Game {

	@Override
	public void create() {
		setScreen(new GameScreen(this));
	}

}
