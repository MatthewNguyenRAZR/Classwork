package gui.whackAMole;

import gui.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private int appearanceTime;

	public Mole(int x, int y) {
		super(x, y, .9,"resoucres/sampleImages/mole.png");
		
	}

	@Override
	public int getAppearanceTime() {
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int screenTime) {
		appearanceTime = screenTime;

	}

}
