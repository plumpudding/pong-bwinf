package de.jm.pong.drawable;

import de.jm.pong.util.DrawUtil;

public class Number extends IDrawable {

	public int i;
	
	public void setI(int i) {
		this.i = i;
		width = 5*String.valueOf(i).length()-1;
	}

	public int getI() {
		return i;
	}
	
	public Number(int i, int x, int y) {
		this.x = x;
		this.y = y;
		setI(i);
	}
	
	@Override
	public void draw(boolean[][] board) {
		DrawUtil.drawNumber(i, getXPos(), getYPos(), false, board);
	}
}
