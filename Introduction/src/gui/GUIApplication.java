package gui;

import javax.swing.JFrame;

public class GUIApplication extends JFrame{
	
	//demo purposes only
	public static void main(String[] args){
		new GUIApplication(600,600);
	}
	public GUIApplication(int width, int height) {
		super();
		setBounds(20, 20, width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
