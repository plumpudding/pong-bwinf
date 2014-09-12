package de.jm.pong.drawable;

public abstract class IDrawable {

	public int i, width, heigth;
	public float x, y;
	
	public int getHeigth() {
		return heigth;
	}
	
	public int getWidth() {
		return width;
	}
	
	public float getXPos() {
		return x;
	}
	
	public float getYPos() {
		return y;
	}
	
	public void draw(boolean[][] board) {}
}
