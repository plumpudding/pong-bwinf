package de.jm.pong;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Pong {
	public final int displayX;
	public final int displayY;
	public final int gameX;
	public final int gameY;
	
	public Renderer renderer;
	public Logic logic;
	
	public Pong(int gameX, int gameY, int displayX, int displayY) {
		this.gameX = gameX;
		this.gameY = gameY;
		this.displayX = displayX;
		this.displayY = displayY;
	}
	
	public void startGame() {
		
		try {
			//Create Display
			Display.setDisplayMode(new DisplayMode (displayX, displayY));
			Display.setFullscreen(true);
			Display.setResizable(true);
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		renderer = new Renderer();
		logic = new Logic(gameX, gameY);

		logic.drawCipher(0, 10, 2);
		logic.drawCipher(1, 50, 2);
		
		while (!Display.isCloseRequested()) {
			renderer.render(Logic.gameBoard);
		    Display.update();
		}
		
		Display.destroy();
	}
}
