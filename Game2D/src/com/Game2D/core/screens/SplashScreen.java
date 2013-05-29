package com.Game2D.core.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SplashScreen implements Screen {

	protected Game game;
	
	SpriteBatch batch;
	Texture texture;
	Sprite sprite;
	
	public SplashScreen(Game game) {
		this.game = game;
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

		batch.begin();
		sprite.draw(batch);
		batch.end();
		
	}
	
	@Override
	public void dispose() {

	}
	
	@Override
	public void show() {
		texture = new Texture("res/pictures/lol.png");
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		sprite = new Sprite(texture);

		batch = new SpriteBatch();
		
	}

	@Override
	public void hide() {

	}

	@Override
	public void pause() {

	}


	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void resume() {

	}


}
