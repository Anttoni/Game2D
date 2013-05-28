package com.Game2D.core.sound;

import java.io.File;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class SoundHandler {

	private int amountOfSounds;
	public Sound[] sounds = new Sound[amountOfSounds];
	private String[] fileNames;
	public Sound currentlyPlaying;
	public long soundID = 0;
	
	public void initSounds(String path) {
		File folder = new File(path);
		fileNames = folder.list();
		for(int i = 0; i < fileNames.length; i++) {
			String temp = fileNames[i].toString();
			sounds[i] = Gdx.audio.newSound(Gdx.files.internal(temp));
		}
		amountOfSounds = fileNames.length;
	}
	
	/**
	 * @param sound Sound to play
	 */
	public void playSound(Sound sound) {
		currentlyPlaying = sound;
		soundID = sound.play();
	}
	
	public void stopPlaying() {
		if(currentlyPlaying != null)
			currentlyPlaying.stop();
	}
	
	/**
	 * @param sound The sound to play
	 * @param volume The volume to set (between 0, 1)
	 */
	public void setVolume(Sound sound, float volume) {
		sound.setVolume(soundID, volume);
	}
	
	/**
	 * @param sound Sound to change pan and volume
	 * @param pan Pan (-1 for Left, 1 for Right, 0 for center)
	 * @param volume The volume to set (between 0, 1)
	 */
	public void setPan(Sound sound, float pan, float volume) {
		sound.setPan(soundID, pan, volume);
	}
	
	/**
	 * @param sound Sound to set looping
	 * @param flag true or false
	 */
	public void setLooping(Sound sound, boolean flag) {
		sound.setLooping(soundID, flag);
	}
	
	/**
	 * @param sound Sound to change pitch
	 * @param pitch <-1 Lower - 0 Normal - >1 Higher
	 */
	public void setPitch(Sound sound, float pitch) {
		sound.setPitch(soundID, pitch);
	}
	
	public void destroy(Sound sound) {
		sound.dispose();
	}
	
}
