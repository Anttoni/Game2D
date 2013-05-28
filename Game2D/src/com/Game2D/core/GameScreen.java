package com.Game2D.core;

import com.Game2D.core.renderer.GameRenderer;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL10;

public class GameScreen extends GameScreenContainer {

	public GameRenderer renderer = new GameRenderer();
	
	public GameScreen(Game game) {
		super(game);
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		if(Gdx.input.isKeyPressed(Keys.ESCAPE)) {
			dispose();
		}
		
	}
	
}
