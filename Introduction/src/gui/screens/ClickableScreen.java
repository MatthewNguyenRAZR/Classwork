package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import gui.Graphic;
import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.Clickable;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.sampleGames.MouseFollower;

public class ClickableScreen extends Screen implements MouseListener{
	
	private ArrayList<Clickable> clickables;
	public ClickableScreen() {
		super();
	}
	
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public MouseListener getMouseListener(){
		return this;
	}
	
}
