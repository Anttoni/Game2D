package com.Game2D.core.entity;

import com.Game2D.core.util.Position;

public abstract class AbstractEntity implements IEntity {
	
	protected Position position;
	
	public int getX() {
		return position.getX();
	}
	
	public int getY() {
		return position.getY();
	}
	
	public void setPosition(int x, int y) {
		position.setX(x);
		position.setY(y);
	}
	
	public void setX(int x) {
		position.setX(x);
	}

	public void setY(int y) {
		position.setY(y);
	}
	
	public abstract void render(float delta);
	public abstract void dispose();
	
}
