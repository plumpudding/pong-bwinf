package de.jm.pong;

import de.jm.pong.core.Pong;

public class Main {
	
	public static void main(String[] args) {
		
		Pong game = new Pong(50, 50, 1000, 600);
		
		game.startGame();
		
	}
}
