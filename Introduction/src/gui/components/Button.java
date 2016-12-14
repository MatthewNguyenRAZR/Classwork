package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel {
	private Color color;
	private Action action;
	
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		/*
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.text = text;
		*/
		this.color = color;
		this.action = action;
		update();
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
		update();
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(color);
		g.fillRoundRect(0, 0, getWidth(), getHeight(), 35, 25);
		g.setColor(Color.BLACK);
		//g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 35, 25);
		g.drawRoundRect(0, 0, getWidth(), getHeight(), 35, 25);
		g.setColor(Color.WHITE);
		g.setFont(new Font(this.getFont(),Font.PLAIN,this.getSize()));
		if(this.getText() != null) g.drawString(this.getText(), 4, getHeight()-5);
	}
	/*
	@Override
	public boolean isHovered(int x, int y){
		return x > getX() && x < getX()+getWidth() && y > getY() && y < getY()+getHeight()
	}
	*/
	@Override
	public void act(){
		action.act();
	}
}
