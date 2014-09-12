package de.jm.pong.core;

import java.util.ArrayList;
import java.util.List;

import de.jm.pong.drawable.IDrawable;
import de.jm.pong.drawable.Number;
import de.jm.pong.util.DrawUtil;

public class Logic {

	public boolean[][] gameBoard;
	public List<IDrawable> drawables;

	public Number p1score;
	public Number p2score;
	public de.jm.pong.drawable.Pong p;
	
	public Logic(int gameX, int gameY) {
		gameBoard = new boolean[gameX][gameY];
		drawables = new ArrayList<IDrawable>();
		p1score = new Number(0, 2, 2);
		p2score = new Number(0, 2, 10);
		drawables.add(p1score);
		drawables.add(p2score);
		p = new de.jm.pong.drawable.Pong(135, 50, 20);
		drawables.add(p);
	}

	public void tick() {
		DrawUtil.clear(gameBoard);
		for (IDrawable d:drawables) {
			d.draw(gameBoard);
		}
		
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		p.move();
	}
}
