package gui;
/*
What is the purpose of abstract classes?
So that children can do their own thing.  Game engine used to make programming games easier

Why are there 2 update methods in Component?


How does the CoordinateScreen Display text?


Why are we using ArrayList instead of Array?
So that classes can be dynamic, being able to add and remove items from the list
 
 */
//you can't instantiate an abstract class
	//declaration 					int[] num;
	//instantiation(initialized) 	num = new int[5];
	/*
	Abstraction
	interface: implment as many interfaces as you want
		description of methods
	abstract class: only entend one class
		description of methods
		methods = only useful to subclasses that inherit this class
	
	abstract - "
	GUIApplication - MouseFollower
	Screen - CoordinateScreen
	Visible - Component - TextLabel
	*/

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame implements Runnable{
	
	private Screen currentScreen;
	
	public GUIApplication(int width, int height) {
		super();
		//setUndecorated(true);
		setBounds(20,20, width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// terminates program when window is closed
		initScreen();
		setVisible(true);
	}

	public abstract void initScreen();
	
	public void paint(Graphics g) {
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void setScreen(Screen s) {
		if(currentScreen != null) {
			MouseListener ml = currentScreen.getMouseListener();
			if(ml != null) {
				removeMouseListener(ml);
			}
			MouseMotionListener mml = currentScreen.getMouseMotionListener();
			if (mml != null) {
				removeMouseMotionListener(mml);
			}
		}
		currentScreen = s;
		if(currentScreen != null) {
			addMouseListener(currentScreen.getMouseListener());
			addMouseMotionListener(currentScreen.getMouseMotionListener());
		}
	}
	
	public void run() {
		while(true) {
			currentScreen.update();
			repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
