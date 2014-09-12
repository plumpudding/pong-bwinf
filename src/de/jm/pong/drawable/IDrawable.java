package de.jm.pong.drawable;

public abstract class IDrawable {
	
	public int i, width, heigth, x, y;
	
	public int getHeigth() {
		return heigth;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getXPos() {
		return x;
	}
	
	public int getYPos() {
		return y;
	}
	
	public void draw(boolean[][] board) {}
}
