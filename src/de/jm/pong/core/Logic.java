package de.jm.pong.core;

import java.util.ArrayList;
import java.util.List;

import de.jm.pong.drawable.IDrawable;
import de.jm.pong.drawable.Number;
import de.jm.pong.drawable.Pong;
import de.jm.pong.drawable.Racket;
import de.jm.pong.drawable.Rectangle;
import de.jm.pong.util.DrawUtil;

public class Logic {

	public boolean[][] gameBoard;
	public List<IDrawable> drawables;

	public Racket p1racket;
	public Number p1score;
	public Number p2score;
	public de.jm.pong.drawable.Pong p;
	
	public Logic(int gameX, int gameY) {
		gameBoard = new boolean[gameX][gameY];
		drawables = new ArrayList<IDrawable>();
		p = new Pong(120, gameBoard.length/2, gameBoard[0].length/2);
		p1score = new Number(0, gameBoard.length, 1, true);;
		p2score = new Number(0, 1, 1, false);
		p1racket = new Racket(gameBoard.length-2);
		drawables.add(p1racket);
		drawables.add(new Racket(1));
		drawables.add(new Rectangle(0, 9, gameBoard.length, 1));
		drawables.add(p);
		drawables.add(p1score);
		drawables.add(p2score);
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
