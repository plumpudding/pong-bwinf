package de.jm.pong.core;

import java.util.ArrayList;
import java.util.List;

import de.jm.pong.drawable.IDrawable;
import de.jm.pong.drawable.Number;
import de.jm.pong.drawable.Pong;
import de.jm.pong.util.DrawUtil;

public class Logic {

	public boolean[][] gameBoard;
	public List<IDrawable> drawables;

	public Number p1score;
	public Number p2score;
	public de.jm.pong.drawable.Pong p;
	
	public Logic(int gameX, int gameY) {
		gameBoard = new boolean[gameX][gameY];
		System.out.println(gameX);
		System.out.println(gameBoard.length);
		System.out.println(gameY);
		System.out.println(gameBoard[0].length);
		drawables = new ArrayList<IDrawable>();
//		p1score = new Number(0, 2, 2);
//		p2score = new Number(0, 2, 10);
//		drawables.add(p1score);
//		drawables.add(p2score);
//		drawables.add(new Rectangle(1, 1, 1, 8));
//		drawables.add(new Rectangle(8, 1, 1, 8));
//		drawables.add(new Rectangle(1, 1, 8, 1));
//		drawables.add(new Rectangle(1, 8, 7, 1));
		p = new Pong(315, 2, 8);
		drawables.add(p);
	}

	public void tick() {
		DrawUtil.clear(gameBoard);
		for (IDrawable d:drawables) {
			d.draw(gameBoard);
		}
	}
	
	public boolean getFieldAt(int x, int y) {
		if (x>=0 && x<gameBoard.length && y>=0 && y<gameBoard[0].length) {
			return gameBoard[x][y];
		}
		
		return true;
	}
}
