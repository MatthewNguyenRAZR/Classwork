package gui.components;

import java.awt.image.BufferedImage;

public abstract interface Visible {
	public BufferedImage getImage();
	public int getX();
	public int getY();
	public int getWidth();
	public int getHeight();
	public boolean isAnimated();
	public void update();
	boolean isHovered(int x, int y);
	void act();
}
