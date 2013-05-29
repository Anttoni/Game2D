package com.Game2D.core.sound;

import java.io.File;

import com.Game2D.core.util.FileUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class SoundHandler {

	/*
	 * Todo:
	 *  - Play multiple sounds at once
	 *  - Sound fade -  out / fade - in
	 */
	
	private int amountOfSounds;
	public Sound[] sounds = new Sound[amountOfSounds];
	public Sound currentlyPlaying;
	public long soundID = 0;
	protected float volume;
	protected StringBuffer buffer;
	
	public void initSounds(File file) {
		String[] files = FileUtils.listAllFiles(file);
		buffer = new StringBuffer();
		for(int i = 0; i < files.length; i++) {
			buffer.append(files[i]);
			sounds[i] = Gdx.audio.newSound(Gdx.files.internal(file.getAbsolutePath() + buffer.toString()));
		}
		amountOfSounds = files.length;
	}
	
	/**
	 * @param sound Sound to play
	 */
	public void playSound(Sound sound) {
		if(currentlyPlaying == null) {
			currentlyPlaying = sound;
			soundID = sound.play();
		} else if(currentlyPlaying != null) {
			currentlyPlaying.stop();
			soundID = sound.play();
		}
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
		this.volume = volume;
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
