package de.jm.pong.drawable;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

import de.jm.pong.util.DrawUtil;

public class Racket extends IDrawable {
	
	public Racket(float x) {
		this.x = x;
	}
	
	@Override
	public void draw(boolean[][] board) {
		
		float y = (Display.getHeight()-Mouse.getY())/(float)Display.getHeight()*board[0].length;
		if (y<10) y=10; else if (y>board[0].length-10) y=board[0].length-10;
		DrawUtil.drawRectangle((int) x, (int) y, 1, 10, true, board);
	}
}
