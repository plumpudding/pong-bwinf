package de.jm.pong.util;

public class DrawUtil {
	
	public static void clear(int x, int y, int width, int heigth, boolean[][] gameBoard) {
		for (int w = 0; w < width; w++) {
			for (int h = 0; h < heigth; h++) {
				DrawUtil.drawPoint(x+w, y+h, false, gameBoard);
			}
		}
	}
	
	public static void drawPoint(int x, int y, boolean b, boolean[][] gameBoard) {
		if(0<=x && x<gameBoard[0].length && 0<=y && y<gameBoard.length) {
			gameBoard[x][y] = b;
		}
	}
	
	public static void drawNumber(int i, int x, int y, boolean rToL, boolean[][] gameBoard) {
        String s = String.valueOf(i);
        if (rToL) {
        	for (int j = s.length()-1; j >= 0; j--) {
        		drawCipher(Integer.parseInt(String.valueOf(s.charAt(j))), x-5*(s.length()-j), y, gameBoard);
        	}
        } else {
        	for (int j = 0; j < s.length(); j++) {
        		drawCipher(Integer.parseInt(String.valueOf(s.charAt(j))), x+5*j, y, gameBoard);
        	}
        }
	}
	
	public static void drawCipher(int i, int x, int y, boolean[][] gameBoard) {
		DrawUtil.clear(x, y, 4, 7, gameBoard);
		switch(i) {
		case 0:
			drawSegment(1, x, y, gameBoard);
			drawSegment(2, x, y, gameBoard);
			drawSegment(3, x, y, gameBoard);
			drawSegment(5, x, y, gameBoard);
			drawSegment(6, x, y, gameBoard);
			drawSegment(7, x, y, gameBoard);
			break;
		case 1:
			drawSegment(3, x, y, gameBoard);
			drawSegment(6, x, y, gameBoard);
			break;
		case 2:
			drawSegment(1, x, y, gameBoard);
			drawSegment(3, x, y, gameBoard);
			drawSegment(4, x, y, gameBoard);
			drawSegment(5, x, y, gameBoard);
			drawSegment(7, x, y, gameBoard);
			break;
		case 3:
			drawSegment(1, x, y, gameBoard);
			drawSegment(3, x, y, gameBoard);
			drawSegment(4, x, y, gameBoard);
			drawSegment(6, x, y, gameBoard);
			drawSegment(7, x, y, gameBoard);
			break;
		case 4:
			drawSegment(2, x, y, gameBoard);
			drawSegment(3, x, y, gameBoard);
			drawSegment(4, x, y, gameBoard);
			drawSegment(6, x, y, gameBoard);
			break;
		case 5:
			drawSegment(1, x, y, gameBoard);
			drawSegment(2, x, y, gameBoard);
			drawSegment(4, x, y, gameBoard);
			drawSegment(6, x, y, gameBoard);
			drawSegment(7, x, y, gameBoard);
			break;
		case 6:
			drawSegment(1, x, y, gameBoard);
			drawSegment(2, x, y, gameBoard);
			drawSegment(4, x, y, gameBoard);
			drawSegment(5, x, y, gameBoard);
			drawSegment(6, x, y, gameBoard);
			drawSegment(7, x, y, gameBoard);
			break;
		case 7:
			drawSegment(1, x, y, gameBoard);
			drawSegment(3, x, y, gameBoard);
			drawSegment(6, x, y, gameBoard);
			break;
		case 8:
			drawSegment(1, x, y, gameBoard);
			drawSegment(2, x, y, gameBoard);
			drawSegment(3, x, y, gameBoard);
			drawSegment(4, x, y, gameBoard);
			drawSegment(5, x, y, gameBoard);
			drawSegment(6, x, y, gameBoard);
			drawSegment(7, x, y, gameBoard);
			break;
		case 9:
			drawSegment(1, x, y, gameBoard);
			drawSegment(2, x, y, gameBoard);
			drawSegment(3, x, y, gameBoard);
			drawSegment(4, x, y, gameBoard);
			drawSegment(6, x, y, gameBoard);
			drawSegment(7, x, y, gameBoard);
			break;
		}
	}
	
	public static void drawSegment(int i, int x, int y, boolean[][] gameBoard) {
		switch(i) {
		case 1:
			DrawUtil.drawPoint(x, y, true, gameBoard);
			DrawUtil.drawPoint(x+1, y, true, gameBoard);
			DrawUtil.drawPoint(x+2, y, true, gameBoard);
			DrawUtil.drawPoint(x+3, y, true, gameBoard);
			break;
		case 2:
			DrawUtil.drawPoint(x, y, true, gameBoard);
			DrawUtil.drawPoint(x, y+1, true, gameBoard);
			DrawUtil.drawPoint(x, y+2, true, gameBoard);
			DrawUtil.drawPoint(x, y+3, true, gameBoard);
			break;
		case 3:
			DrawUtil.drawPoint(x+3, y, true, gameBoard);
			DrawUtil.drawPoint(x+3, y+1, true, gameBoard);
			DrawUtil.drawPoint(x+3, y+2, true, gameBoard);
			DrawUtil.drawPoint(x+3, y+3, true, gameBoard);
			break;
		case 4:
			DrawUtil.drawPoint(x, y+3, true, gameBoard);
			DrawUtil.drawPoint(x+1, y+3, true, gameBoard);
			DrawUtil.drawPoint(x+2, y+3, true, gameBoard);
			DrawUtil.drawPoint(x+3, y+3, true, gameBoard);
			break;
		case 5:
			DrawUtil.drawPoint(x, y+3, true, gameBoard);
			DrawUtil.drawPoint(x, y+4, true, gameBoard);
			DrawUtil.drawPoint(x, y+5, true, gameBoard);
			DrawUtil.drawPoint(x, y+6, true, gameBoard);
			break;
		case 6:
			DrawUtil.drawPoint(x+3, y+3, true, gameBoard);
			DrawUtil.drawPoint(x+3, y+4, true, gameBoard);
			DrawUtil.drawPoint(x+3, y+5, true, gameBoard);
			DrawUtil.drawPoint(x+3, y+6, true, gameBoard);
			break;
		case 7:
			DrawUtil.drawPoint(x, y+6, true, gameBoard);
			DrawUtil.drawPoint(x+1, y+6, true, gameBoard);
			DrawUtil.drawPoint(x+2, y+6, true, gameBoard);
			DrawUtil.drawPoint(x+3, y+6, true, gameBoard);
			break;
		}
	}
}
