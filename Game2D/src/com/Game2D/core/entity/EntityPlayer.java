package com.Game2D.core.entity;

import com.badlogic.gdx.Gdx;

public class EntityPlayer extends Entity {
	
	@Override
	public void render(float delta) {
		delta = Gdx.graphics.getDeltaTime();
	}

	@Override
	public void dispose() {

	}

	@Override
	public void update(float delta) {
		delta = Gdx.graphics.getDeltaTime();
	}
	
}
