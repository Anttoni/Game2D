package com.Game2D.core;

import com.Game2D.core.renderer.GameRenderer;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class GameScreen extends GameContainer {

	public GameRenderer renderer = new GameRenderer();
	
	public static void main(String args[]) {
	      LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
	      	cfg.title = "Drop";
	      	cfg.useGL20 = true;
	      	cfg.width = 800;
	      	cfg.height = 480;
	      new LwjglApplication(new GameContainer(), cfg);
	}

}
