package com.Game2D.core.entity;

import com.Game2D.core.util.Position;

public class Entity extends AbstractEntity {

	protected Position position;
	
	@Override
	public void setX(int x) {
		position.setX(x);
	}

	@Override
	public void setY(int y) {
		position.setY(y);
	}

	public void setPosition(int x, int y) {
		position.setX(x);
		position.setY(y);
	}
	
	@Override
	public void render(float delta) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public void update(float delta) {

	}

}
