package gui.whackAMole;

import java.util.ArrayList;

import gui.GUIApplication;
import gui.components.TextLabel;

public class WhackAMoleGame extends GUIApplication implements Runnable{
	
	public WhackAMoleGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		WhackAMoleScreen wams = new WhackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);
	}

	public static void main(String[] args) {
		WhackAMoleGame wamg = new WhackAMoleGame(800, 500);
		Thread game = new Thread(wamg);
		game.start();
	}
	public static void run(){
		
	}
}
