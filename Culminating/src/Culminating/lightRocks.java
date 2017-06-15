package Culminating;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * using light sensor, checks if the ping pong ball is black(rock) or not(miner) and if its a rock the robot pushes it out of the way. 
 * lightRocks.java
 * June 14, 2017
 * @author Alyssa Nodello
 *
 */
public class lightRocks implements Behavior{
	private boolean suppressed = false;
	private LightSensor light;
	
	public lightRocks(LightSensor ls){
		this.light = ls;
	}
	/**
	 * stops the running of the action
	 * @param no parameter
	 *  @return no return
	 */
	public void suppress(){
		suppressed = true;
	}
	/**
	 * scans to see if the colour of the ball is black and will take control if it is
	 * @param no parameter
	 *  @return no return
	 */
	public boolean takeControl(){
		
		if (light.getLightValue() < 30 && light.getLightValue() > 24){ // the ping pong ball is black so is a rock, triggers action code
			return true;
		}
		return false;
		
	}
	/**
	 * moves golf ball to left using arm 
	 * robot and arm returns to original position
	 * @param no parameter
	 *  @return no return
	 */
	public void  action (){
		//moves the ping pong ball to the safety pad	
				Motor.B.stop();//stops robot
				Motor.C.stop();
				Delay.msDelay(500);
				//use motor a as arm to scoop the ball by pushing arm down around ball
				Motor.A.rotate(135);
				//half rotation to turn to black pad
				Motor.B.forward();
				Delay.msDelay(1500);
				Motor.B.stop();
				//move motor a to release ball by lifting arm
				Motor.A.rotate(-135);
				//half rotation back to face area with balls
				Motor.C.forward();
				Delay.msDelay(250);
				Motor.C.stop();
				
		
	}
}
