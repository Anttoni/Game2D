package com.Game2D.core.screens;

import com.Game2D.core.GameMain;
import com.Game2D.core.renderer.GameRenderer;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class GameScreen implements Screen {

	SpriteBatch batch;
	GameRenderer renderer;
	protected static OrthographicCamera cam;
	private Rectangle glViewport;
	
	@Override
	public void dispose() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void render(float delta) {
		GL10 gl = Gdx.graphics.getGL10();
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		gl.glViewport((int) glViewport.x, (int) glViewport.y, (int) glViewport.width, (int) glViewport.height); 

		cam.update();
		cam.apply(gl);
		
		renderer.render(delta);
	}

	@Override
	public void resize(int arg0, int arg1) {

	}

	@Override
	public void resume() {

	}

	@Override
	public void show() {
		cam = new OrthographicCamera(GameMain.WIDTH, GameMain.HEIGHT);
		cam.position.set(GameMain.WIDTH / 2, GameMain.HEIGHT / 2, 0);
	}

}
