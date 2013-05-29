package com.Game2D.core.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class EntityPlayer extends Entity {
	
	Texture playerTexture;
	Sprite playerSprite;
	
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
