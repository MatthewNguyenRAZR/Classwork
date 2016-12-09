package gui;

import java.awt.image.BufferedImage;

public class Screen {
	private BufferedImage image;
	
	public Screen(int width,int height) {
		initImage(width, height);
	}

	public void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
	}

}
