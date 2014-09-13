package de.jm.pong.drawable;

import de.jm.pong.util.DrawUtil;

public class Rectangle extends IDrawable {
	public Rectangle(int x, int y, int width, int heigth) {
		this.x = x;
		this.y = y;
		this.heigth = heigth;
		this.width = width;
	}
	
	@Override
	public void draw(boolean[][] gameBoard) {
		DrawUtil.drawRectangle((int)x, (int)y, width, heigth, true, gameBoard);
	}
}
