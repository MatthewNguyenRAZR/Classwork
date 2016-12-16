package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	private TextLabel text;
	private Button button;
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20,200,500,40,"some text");
		button = new Button(100,140,150,40,"Button", new Color(0,76,153), new Action(){
			public void act(){		
		}});
		viewObjects.add(text);
	}
	@Override
	public void mouseDragged(MouseEvent e){
		
	}
	@Override
	public void mouseMoved(MouseEvent e){
		int mx = e.getX();//getmouse X coordinate
		int my = e.getY();//get Y coord
		text.setText("Mouse at:"+mx+", "+my);
	}
	public MouseMotionListener getMouseMotionListener(){
		return this;
		
	}

}
