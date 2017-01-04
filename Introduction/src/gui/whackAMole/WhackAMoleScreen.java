package gui.whackAMole;

import java.util.ArrayList;
import java.util.List;

import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class WhackAMoleScreen extends ClickableScreen {
	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30;
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350, 220, 100, 40,"");
		timeLabel = new TextLabel(360, 40, 80, 40, "30.0");
		//viewObjects.add(player);
		viewObjects.add(timeLabel);
		viewObjects.add(label);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub

	}
	
	private PlayerInterface getAPlayer() {
		return null;
	}
	private MoleInterface getAMole() {
		return null;
	}
}
