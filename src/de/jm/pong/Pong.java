package de.jm.pong;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

public class Pong {
	public static int displayX = 1920;
	public static int displayY = 1080;
	public static int gameX = 64;
	public static int gameY = 27;
	public static boolean[][] gameBoard = new boolean[gameX][gameY];
	
	public void startGame() {
		
//		for (int x=0;x<gameX;x++) {
//			for (int y=0;y<gameY;y++) {
//				gameBoard[x][y] = true;
//			}
//		}
		gameBoard[gameX-1][gameY-1] = true;
		
		try {
			//Create Display
			Display.setDisplayMode(new DisplayMode (displayX, displayY));
			Display.setFullscreen(true);
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Initialize OpenGL
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, displayX, displayY, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		
		while (!Display.isCloseRequested()) {
			tick();
		}
		
		Display.destroy();
	}
	
	public void tick() {
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		glColor4f(1f, 1f, 1f, 1f);
		
		for (int x=0;x<gameX;x++) {
			for (int y=0;y<gameY;y++) {
				if (gameBoard[x][y] == true) {
					drawQuad(x, y);
				}
			}
		}
		
	    Display.update();
	}
	
	public void drawQuad(int posX, int posY) {
		glBegin(GL_QUADS);
			glVertex2f(posX*(displayX/gameX), 					posY*(displayY/gameY));
			glVertex2f(posX*(displayX/gameX)+(displayX/gameX),	posY*(displayY/gameY));
			glVertex2f(posX*(displayX/gameX)+(displayX/gameX),	posY*(displayY/gameY)+(displayY/gameY));
			glVertex2f(posX*(displayX/gameX), 					posY*(displayY/gameY)+(displayY/gameY));
		glEnd();
	}
	
}
