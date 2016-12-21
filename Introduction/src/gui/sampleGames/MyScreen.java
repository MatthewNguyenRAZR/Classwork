package gui.sampleGames;

import java.util.ArrayList;

import gui.Screen;
import gui.components.TextLabel;
import gui.components.Visible;

public class MyScreen extends Screen{

	private TextLabel text;
	
	public MyScreen(int w, int h) {
		super(w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20,200,500,40,"Here is some text");
		viewObjects.add(text);
		System.out.println(viewObjects);
		
	}

}
