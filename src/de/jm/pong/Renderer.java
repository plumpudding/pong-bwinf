package de.jm.pong;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glColor4f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glVertex2f;
import static org.lwjgl.opengl.GL11.glViewport;

import org.lwjgl.opengl.Display;

public class Renderer {
	
	public Renderer() {
		//Initialize OpenGL
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, Display.getWidth(), Display.getHeight(), 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		glColor4f(1f, 1f, 1f, 1f);
	}
	
	public void render(boolean[][] gameBoard) {
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		
		for (int x=0;x<gameBoard.length;x++) {
			for (int y=0;y<gameBoard[0].length;y++) {
				if (gameBoard[x][y] == true) {
					drawQuad(x, y, gameBoard[0].length, gameBoard.length);
				}
			}
		}
	}
	
	private void drawQuad(int posX, int posY, int gameX, int gameY) {
		glBegin(GL_QUADS);
			float ratioX = (float)Display.getWidth()/gameY;
			float ratioY = (float)Display.getHeight()/gameX;
			glVertex2f((int)(posX*(ratioX)),			(int)(posY*(ratioY)));
			glVertex2f((int)(posX*(ratioX)+(ratioX)),	(int)(posY*(ratioY)));
			glVertex2f((int)(posX*(ratioX)+(ratioX)),	(int)(posY*(ratioY)+ratioY));
			glVertex2f((int)(posX*(ratioX)),			(int)(posY*(ratioY)+ratioY));
		glEnd();
	}

	public void handleResize(int width, int height) {
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glViewport(0, 0, width, height);
		glOrtho(0, Display.getWidth(), Display.getHeight(), 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
	}
}
