package Culminating;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
/**
 * driveForward.java
 * June  12, 2017
 * drives robot forward and is the default behavior
 * @author Alyssa Nodello
 *
 */
public class driveForward  implements Behavior{
	private boolean suppressed = false;
	/**
	 * stops the running of the action
	 * @param no parameter
	 *  @return no return
	 */
	public void suppress(){
		suppressed = true;
	}
	/**
	 * always in control because this is the lowest priority
	 * @param no parameter
	 *  @return no return
	 */
	public boolean takeControl(){
		return true;
	}
	/**
	 * drives robot forward at half a rotation per second  until another behavior is activated
	 * @param no parameter
	 *  @return no return
	 */
	public void action(){
		suppressed = false;
		Motor.B.setSpeed(180);// slow speed so it can scan distance more frequently
		Motor.C.setSpeed(180);
		Motor.B.forward();
		Motor.C.forward();
		while (!suppressed){
			Thread.yield();
		}
		Motor.B.stop();
		Motor.C.stop();
	}
}
