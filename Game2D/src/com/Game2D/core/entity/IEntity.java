package com.Game2D.core.entity;

public interface IEntity {
	
	public void render(float delta);
	public void update(float delta);
	public void dispose();
	
	//Coordinates
	public int getX();
	public int getY();
	
	public void setX(int x);
	public void setY(int y);
	
}
