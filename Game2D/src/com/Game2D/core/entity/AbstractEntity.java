package com.Game2D.core.entity;

public abstract class AbstractEntity implements IEntity {
	
	protected int x;
	protected int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public abstract void render(float delta);
	public abstract void dispose();
	
}
