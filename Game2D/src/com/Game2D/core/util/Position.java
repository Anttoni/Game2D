package com.Game2D.core.util;

public class Position {

	protected int x, y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setPosition(Position p) {
		p.setX(x);
		p.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
