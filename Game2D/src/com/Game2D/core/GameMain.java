package com.Game2D.core;

import com.Game2D.core.renderer.GameRenderer;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class GameMain extends GameContainer {

	public GameRenderer renderer = new GameRenderer();
	
	public final static int WIDTH = 1280;
	public final static int HEIGHT = 720;
	
	public final static String SOUND_PATH = "res/sound/";
	public final static String PICTURES_PATH = "res/pictures/";
	
	public static void main(String args[]) {
	      LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
	      	cfg.title = "2D Roguelike Game";
	      	cfg.useGL20 = false;
	      	cfg.width = WIDTH;
	      	cfg.height = HEIGHT;
	      	
	      new LwjglApplication(new GameContainer(), cfg);
	}
}
