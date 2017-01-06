package gui.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import gui.Graphic;
import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class MyScreen extends Screen implements MouseListener{

	private TextLabel text;
	private Button back;
	private Graphic hennessyvenomgt;
	
	public MyScreen(int w, int h) {
		super(w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(200, 50,500,40,"Hennessey Venom GT");
		viewObjects.add(text);
		System.out.println(viewObjects);
		
		back = new Button(20,100,120,40,"Back Button",new Color(100,100,250), new Action() {
			public void act() {
				MouseFollower.game.setScreen(MouseFollower.cs);
			}
		});
		viewObjects.add(back);
		
		hennessyvenomgt = new Graphic(50,300,500,500,"resources/sampleImages/hennessyvenomgt.png");
		viewObjects.add(hennessyvenomgt);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(back.isHovered(e.getX(), e.getY())){
			back.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}
}
