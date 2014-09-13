package de.jm.pong;

import de.jm.pong.core.PongGame;

public class Main {
	
	public static void main(String[] args) {
		
		//Create an instance of PongGame and start the game
		PongGame game = new PongGame(128, 64, 1920, 1080);
		game.startGame();
	}
}
