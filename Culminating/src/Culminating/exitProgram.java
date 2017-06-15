package Culminating;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;
/**
 * stops program and robot with a button press as is highest priority
 * @author Alyssa Nodello
 *
 */
public class exitProgram  implements Behavior{
	/**
	 * stops the running of the action
	 * @param no parameter
	 *  @return no return
	 */
	public void suppress(){
	}
	/**
	 * when button is held down the action takes control
	 * @param no parameter
	 *  @return no return
	 */
	public boolean takeControl(){
		if(Button.ESCAPE.isDown()){
			return true;
		}
		return false;
	}
	/**
	 * stops the robots action and ends program
	 * @param no parameter
	 *  @return no return
	 */
	public void action(){
		System.exit(0);
	}
}
