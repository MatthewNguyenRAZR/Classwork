package gui.sampleGames;

import gui.GUIApplication;
import gui.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {
	public static CoordinateScreen cs;
	public static MouseFollower game;
	public static MyScreen myScreen;
	
	public MouseFollower(int width, int height) {
		super(width, height);
		
	}
	
	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		myScreen = new MyScreen(getWidth(), getHeight());
		setScreen(myScreen);
	}
	public static void main(String[] args) {
		game = new MouseFollower(500, 500);
		Thread app = new Thread(game);
		app.start();
	}

}