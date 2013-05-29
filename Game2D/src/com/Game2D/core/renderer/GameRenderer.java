package com.Game2D.core.renderer;

import java.util.List;
import java.util.ArrayList;

import com.Game2D.core.entity.Entity;
import com.Game2D.core.entity.EntityPlayer;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRenderer {

	public List<Entity> entities = new ArrayList<Entity>();
	public SpriteBatch batch = new SpriteBatch(10000);
	OrthographicCamera cam;
	EntityPlayer player;
	
	public void render(float delta) {
		batch.begin();
			player.render(delta);
		batch.end();
	}
	
	
}
