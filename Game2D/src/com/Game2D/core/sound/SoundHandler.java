package com.Game2D.core.sound;

import java.io.File;

import com.badlogic.gdx.audio.Sound;

public class SoundHandler {

	private int amountOfSounds;
	public Sound[] sounds = new Sound[amountOfSounds];
	private String path = "/res/sounds";
	
	
	public void getAmountOfSounds(String path) {
		File folder = new File(path);
		File[] files = folder.listFiles();
		amountOfSounds = files.length;
	}
	
	public void load() {
		getAmountOfSounds(path);
	}
	
}
