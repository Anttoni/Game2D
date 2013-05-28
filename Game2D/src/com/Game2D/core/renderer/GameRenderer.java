package com.Game2D.core.renderer;

import java.util.List;
import java.util.ArrayList;

import com.Game2D.core.entity.Entity;

public class GameRenderer {

	public List<Entity> entities = new ArrayList<Entity>();
	
	public void render(float delta) {
		renderLivingEntites(delta);
	}

	public void destroy() {
		
	}
	
	public void renderLivingEntites(float delta) {
		for(Entity e : entities) {
			e.render(delta);
		}
	}
	
}
