package de.jm.pong.core;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class PongGame {
	public final int displayX;
	public final int displayY;
	public final int gameX;
	public final int gameY;
	
	public static PongGame instance;
	
	public Renderer renderer;
	public Logic logic;
	
	public PongGame(int gameX, int gameY, int displayX, int displayY) {
		this.gameX = gameX;
		this.gameY = gameY;
		this.displayX = displayX;
		this.displayY = displayY;
		instance = this;
	}
	
	public static PongGame getPong() {
		return instance;
	}
	
	public void startGame() {
		
		try {
			//Create Display
			Display.setDisplayMode(new DisplayMode (displayX, displayY));
			Display.setResizable(true);
			Display.create();
			Mouse.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		renderer = new Renderer();
		logic = new Logic(gameX, gameY);
		
		while (!Display.isCloseRequested()) {
			if(Display.wasResized()) {
				renderer.handleResize(Display.getWidth(), Display.getHeight());
			}
			logic.tick();
			renderer.render(logic.gameBoard);
			Display.sync(20);
		    Display.update();
		}
		
		Display.destroy();
		Mouse.destroy();
	}
}
