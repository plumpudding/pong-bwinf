package de.jm.pong;

public class Logic {

	public boolean[][] gameBoard;
	
	int i = 0;
	
	public Logic(int gameX, int gameY) {
		gameBoard = new boolean[gameX][gameY];
	}

	public void tick() {
		i = i + 100;
		DrawUtil.drawNumber(i, 2, 2, false, gameBoard);
	}
}
