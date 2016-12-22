package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Graphic;
import gui.Screen;
import gui.components.Button;
import gui.components.TextArea;
import gui.components.Action;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.sampleGames.MouseFollower;

public class CoordinateScreen extends Screen 
               implements MouseMotionListener, MouseListener{

	
	//FIELD
	private Button button;
	private TextLabel text;
	private TextArea area;
	private Graphic astonmartin;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(20,100,100,40,"The Button with a long name",new Color(100,100,250), new Action() {
			public void act() {
				MouseFollower.game.setScreen(MouseFollower.myScreen);
			}
		});
		viewObjects.add(button);
		
		text = new TextLabel(20, 200, 500, 40, "Mouse Coordinates");
		viewObjects.add(text);
		
		area = new TextArea(200, 50,500,40,"Aston Martin");
		viewObjects.add(area);
		
		astonmartin = new Graphic(50,300,400,400,"resources/sampleImages/astonmartin.png");
		viewObjects.add(astonmartin);
		
		
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get mouse X coordinate
		int my = e. getY();//get Y coord
		text.setText("Mouse at: "+mx +", "+my);
	}

	public MouseMotionListener getMouseMotionListener(){ 
		return this;
	}
	public MouseListener getMouseListener(){ 
		return this;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
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
	
	
	
	
	
	
	
	
	
	
	
}
