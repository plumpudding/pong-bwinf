package de.jm.pong;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Pong {

	public void startGame() {
		try {
			Display.setDisplayMode(new DisplayMode (640, 480));
			Display.setVSyncEnabled(true);
			Display.setTitle("Pong");
			Display.create();
			
			Keyboard.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (!Display.isCloseRequested()) {
			
			
			
		    Display.update();
		}
		
		Display.destroy();
	}

}
