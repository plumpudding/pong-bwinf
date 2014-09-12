package de.jm.pong.drawable;

import de.jm.pong.util.DrawUtil;

public class Pong extends IDrawable {
	
	public int direction;
	
	public Pong(int direction, int x, int y) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	@Override
	public void draw(boolean[][] board) {
		DrawUtil.drawPoint((int)x, (int)y, true, board);
	}
	
	public void setDirection(int dir) {
		this.direction = dir;
	}
	
	public void move() {
		x += Math.cos(Math.toRadians(direction-90));
		y += Math.sin(Math.toRadians(direction-90));
	}
}
