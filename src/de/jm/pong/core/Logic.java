package de.jm.pong.core;

import java.util.ArrayList;
import java.util.List;

import de.jm.pong.drawable.IDrawable;
import de.jm.pong.drawable.Number;
//import de.jm.pong.util.DrawUtil;

public class Logic {

	public boolean[][] gameBoard;
	public List<IDrawable> drawables;
	
	public Number n;
	
	public Logic(int gameX, int gameY) {
		gameBoard = new boolean[gameX][gameY];
		drawables = new ArrayList<IDrawable>();
		n = new Number(1, 2, 2);
		drawables.add(n);
		drawables.add(new Number(20, 40, 20));
	}

	public void tick() {
//		DrawUtil.clear(0, 0, gameBoard[0].length, gameBoard.length, gameBoard);
		for (IDrawable d:drawables) {
			d.draw(gameBoard);
		}
		
		n.setI(n.getI()+10000);
	}
}
