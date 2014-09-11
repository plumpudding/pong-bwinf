package de.jm.pong;

public class Logic {

	public static boolean[][] gameBoard;
	
	public Logic(int gameX, int gameY) {
		gameBoard = new boolean[gameX][gameY];
		
	}
	
	public void drawCipher(int i, int x, int y) {
		switch(i) {
		case 1:
			drawSegment(3, x, y);
			drawSegment(6, x, y);
		case 2:
			drawSegment(1, x, y);
			drawSegment(3, x, y);
			drawSegment(4, x, y);
			drawSegment(5, x, y);
			drawSegment(7, x, y);
		case 3:
			drawSegment(1, x, y);
			drawSegment(2, x, y);
			drawSegment(4, x, y);
			drawSegment(5, x, y);
			drawSegment(7, x, y);
//		case 8:
//			drawSegment(1, x, y);
//			drawSegment(2, x, y);
//			drawSegment(3, x, y);
//			drawSegment(4, x, y);
//			drawSegment(5, x, y);
//			drawSegment(6, x, y);
//			drawSegment(7, x, y);
//		case 8:
//			drawSegment(1, x, y);
//			drawSegment(2, x, y);
//			drawSegment(3, x, y);
//			drawSegment(4, x, y);
//			drawSegment(5, x, y);
//			drawSegment(6, x, y);
//			drawSegment(7, x, y);
//		case 8:
//			drawSegment(1, x, y);
//			drawSegment(2, x, y);
//			drawSegment(3, x, y);
//			drawSegment(4, x, y);
//			drawSegment(5, x, y);
//			drawSegment(6, x, y);
//			drawSegment(7, x, y);
//		case 8:
//			drawSegment(1, x, y);
//			drawSegment(2, x, y);
//			drawSegment(3, x, y);
//			drawSegment(4, x, y);
//			drawSegment(5, x, y);
//			drawSegment(6, x, y);
//			drawSegment(7, x, y);
		case 8:
			drawSegment(1, x, y);
			drawSegment(2, x, y);
			drawSegment(3, x, y);
			drawSegment(4, x, y);
			drawSegment(5, x, y);
			drawSegment(6, x, y);
			drawSegment(7, x, y);
		}
	}
	
	public void drawSegment(int i, int x, int y) {
		switch(i) {
		case 1:
			gameBoard[x][y] = true;
			gameBoard[x+1][y] = true;
			gameBoard[x+2][y] = true;
			gameBoard[x+3][y] = true;
		case 2:
			gameBoard[x][y] = true;
			gameBoard[x][y+1] = true;
			gameBoard[x][y+2] = true;
			gameBoard[x][y+3] = true;
		case 3:
			gameBoard[x+3][y] = true;
			gameBoard[x+3][y+1] = true;
			gameBoard[x+3][y+2] = true;
			gameBoard[x+3][y+3] = true;
		case 4:
			gameBoard[x][y+3] = true;
			gameBoard[x+1][y+3] = true;
			gameBoard[x+2][y+3] = true;
			gameBoard[x+3][y+3] = true;
		case 5:
			gameBoard[x][y+3] = true;
			gameBoard[x][y+4] = true;
			gameBoard[x][y+5] = true;
			gameBoard[x][y+6] = true;
		case 6:
			gameBoard[x+3][y+3] = true;
			gameBoard[x+3][y+4] = true;
			gameBoard[x+3][y+5] = true;
			gameBoard[x+3][y+6] = true;
		case 7:
			gameBoard[x][y+6] = true;
			gameBoard[x+1][y+6] = true;
			gameBoard[x+2][y+6] = true;
			gameBoard[x+3][y+6] = true;
		}
	}
}
