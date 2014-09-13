package de.jm.pong.drawable;

import de.jm.pong.core.PongGame;
import de.jm.pong.util.DrawUtil;

public class Pong extends IDrawable {
	
	public int direction;
	
	public Pong(int direction, int x, int y) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	@Override
	public void draw(boolean[][] board) {
		
		float speed = 1f;

		double estX = x+Math.cos(Math.toRadians(direction-90))/speed;
		double estY = y+Math.sin(Math.toRadians(direction-90))/speed;
		
		if(PongGame.getPong().logic.getFieldAt((int)Math.round(estX), (int)Math.round(estY))) {
			if(estX >= board.length-1) PongGame.getPong().logic.p2score.setI(PongGame.getPong().logic.p1score.i + 1);
			if(estX < 0) PongGame.getPong().logic.p1score.setI(PongGame.getPong().logic.p1score.i + 1);
			
			if (!PongGame.getPong().logic.getFieldAt((int)Math.round(estX), (int)Math.round(estY+1)) || !PongGame.getPong().logic.getFieldAt((int)Math.round(estX), (int)Math.round(estY-1))) {
				direction = Math.abs(360-direction+180);
				//horizontal
			} else {
				direction = Math.abs(360-direction);
				//vertical
			}
		}
		
		estX = Math.cos(Math.toRadians(direction-90))/speed;
		estY = Math.sin(Math.toRadians(direction-90))/speed;
		
		x += estX;
		y += estY;
		
		DrawUtil.drawRectangle(Math.round(x), Math.round(y), 2, 2, true, board);
	}
	
	public void setDirection(int dir) {
		this.direction = dir;
	}
}
