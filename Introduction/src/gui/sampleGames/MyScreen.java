package gui.sampleGames;

import java.awt.Color;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class MyScreen extends Screen{

	private TextLabel text;
	private Button back;
	
	public MyScreen(int w, int h) {
		super(w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20,200,500,40,"Here is some text");
		viewObjects.add(text);
		System.out.println(viewObjects);
		
		back = new Button(20,100,100,40,"Button 2",new Color(100,100,250), new Action() {
			public void act() {
				MouseFollower.game.setScreen(MouseFollower.cs);
			}
		});
		viewObjects.add(back);
	}

}
