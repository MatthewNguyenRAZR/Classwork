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
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import gui.components.Visible;

public abstract class Screen {
	private BufferedImage image;
	private ArrayList<Visible> viewObjects;
	
	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width, height);
	}
	
	public abstract void initObjects(ArrayList<Visible> viewObjects);

	public void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}
	public BufferedImage getImage() {
		return image;
	}
	
	public int getWidth() {
		return image.getWidth();
	}
	
	public int getHeight() {
		return image.getHeight();
	}
	
	public void update() {
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
//		for(int i = 0; i < viewObjects.size(); i++) {
//			
//		}
		for(Visible v: viewObjects) {
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}
	
	public MouseMotionListener getMouseMotionListener() {
		return null;
	}
	
	public MouseListener getMouseListener() {
		return null;
	}
	public void addObject(Visible v){
		viewObjects.add(v);
	}
	public void remove(Visible v){
		/*
		NoteL in this implementation,
		we have a very simple command: remove(v)
		however, remove us a big deal on AP exam because:
		
		when object is removed from a list, 
		every other object after that object is moved up.  
		Respective indices change.
		
		Classic incorrect example:
		List<integer> with
		{4,8,7,1}
		want to remove all integers greater than 5
		
		for(int i = 0; i < list.soze(); i++){
			if(list.get(i)>5){
				list.remove(i);
				
				WRONG because
				i = 0, nothing changes
				i = 1, the '8' is removed
				now we have
				(4,7,1)
				i = 2 nothing changes
				i = 3 exit the loop
				so (4,7,1) is left
				
			}
		}
		
		for(int i = 0; i < list.soze(); i++){
			while(list.get(i)>5){
				list.remove(i);
				i--; //compensate for i++
			}
		}
		
		for the same reason this doesn't work
		(because the size can be changed)
		for(Integer i: list){
			if(i > 5){
				list.remove(i);
			}	
		}
		 */
		viewObjects.remove(v);
	}
	// ABSTRACTION 
		// can implement as many interfaces as you want
	// interface: description of methods
	// abstract class: can only extend one class
		// description of methods + methods 
			// methods only useful to subclasses that inherit this class
	// CANNOT INSTANTIATE AN ABSTRACT CLASS !!!!


}