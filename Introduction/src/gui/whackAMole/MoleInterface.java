/**
 * 
 */
package gui.whackAMole;

import gui.components.Action;
import gui.components.Clickable;

/**
 * @author Student 6
 * this is for my partner, the Enemy Designer to implement
 * 
 */
public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearanceTime(int screenTime);

	void setAction(Action action);

}
