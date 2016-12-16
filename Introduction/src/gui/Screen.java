package gui;


	/*
					Arrays					ArrayList
	declaration		int[] numbs				ArrayList<Integer>numbs
					primitive type			wrapper class
	
	instantiation	nums = new int[5]		numbs = new ArrayList<Integer>()
	
	adding items	num[i] = 4;				nums.add(new Integer(5))
					overrides element at i	appends to List, increases size
	
	
	*/
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.components.Visible;

public abstract class Screen {
	private BufferedImage image;
	private ArrayList<Visible> viewObjects;
	//private List viewObjects;  (ArrayList is a type of List)
	
	public Screen(int width,int height) {
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width, height);
	}
	public void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}
	public abstract void initObjects(ArrayList<Visible> viewObjects);
	public void update() {
		Graphics2D g = image.createGraphics();
		//smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
		//g.drawString("Hello World", 40, 100);
		//g.drawOval(20, 70, 100, 50);
		
//		for(int i = 0; i < viewObjects.size(); i++){
//			
//		}
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}
	public BufferedImage getImage(){
		return image;
	}
	public int getWidth(){
		return image.getWidth();
	}
	public int getHeight(){
		return image.getHeight();
	}
	public MouseListener getMouseListener() {
		return null;
	}
	
	public MouseMotionListener getMouseMotionListener() {
		return null;
	}
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
