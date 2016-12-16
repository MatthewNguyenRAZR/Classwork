package gui.sampleGames;

import gui.GUIApplication;
import gui.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {

	
	//FEILDS
	private CoordinateScreen cs;
	private static Runnable game;
	
	public MouseFollower(int width, int height) {
		super(width, height);
	}
	public void initScreen(){
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
	}
	public static void main(String[] args) {
		new MouseFollower(800,800);
		Thread app = new Thread(game);
		app.start();
	}
}
