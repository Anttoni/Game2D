package com.Game2D.core;

import com.Game2D.core.renderer.GameRenderer;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class GameMain extends GameContainer {

	public GameRenderer renderer = new GameRenderer();
	
	public static void main(String args[]) {
	      LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
	      	cfg.title = "2D Roguelike Game";
	      	cfg.useGL20 = false;
	      	cfg.width = 1280;
	      	cfg.height = 720;
	      new LwjglApplication(new GameContainer(), cfg);
	}
}
