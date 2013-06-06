package com.Game2D.core.sound;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.Game2D.core.GameMain;
import com.Game2D.core.util.FileUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.utils.Timer;

public class SoundHandler {

	/*
	 * Todo:
	 *  - Play multiple sounds at once, could work, not tested
	 */
	
	protected static StringBuilder buffer;
	protected static Timer timer = new Timer();
	
	protected static Map<String, Sound> soundMap = new HashMap<String, Sound>();
	
	public static void initSounds() {
		buffer = new StringBuilder();
		String[] files = FileUtils.listAllFiles(new File(GameMain.SOUND_PATH));
		for(int i = 0; i < files.length; i++) {
			buffer.append(files[i]);
			soundMap.put(buffer.toString(), Gdx.audio.newSound(Gdx.files.internal(GameMain.SOUND_PATH + buffer.toString())));
			buffer.delete(0, buffer.length());
		}
	}
	
	public static void playSound(String name, float volume) {
		if(soundMap.containsKey(name)) {
			Sound sound = soundMap.get(name);
			long id = soundMap.get(name).play();
			sound.setVolume(id, volume);
		} else {
			System.out.println("Sound could not be found");
		}
	}

	public static void destroy() {
		for(Map.Entry<String, Sound> entry : soundMap.entrySet()) {
			Sound sound = entry.getValue();
			sound.dispose();
		}
		soundMap.clear();
	}
	
	public static void dispose(String name) {
		soundMap.get(name).dispose();
	}

}
