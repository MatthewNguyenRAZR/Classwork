package gui;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame{
	//FIELDS
	private Screen currentScreen;
	
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
	
	abstract:"
	
	*/
	
	//demo purposes only
	public GUIApplication(int width, int height) {
		super();
		setBounds(20, 20, width, height);
		//terminates program when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initScreen();
		setVisible(true);
	}
	public abstract void initScreen();
	public void setScreen(Screen s){
		currentScreen = s;
	}
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}
