package Culminating;


import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;
/**
 * @author Alyssa Nodello
 * closeToWall.java
 * June 13 2017
 * uses ultrasonic sensor to see how close the robot is to the maze walls and turn around corners if too close.
 */
public class closeToWall implements Behavior {
	private boolean suppressed = false;
	private UltrasonicSensor sonar;
	
	public closeToWall(UltrasonicSensor us){
		this.sonar = us;
	}
	/**
	 * stops the running of the action
	 *  @param no parameter
	 *  @return no return
	 */
	public void suppress(){
		suppressed = true;
	}
	/**scanning to see distance from wall
	 * if closer than 17cm away robot will run the action code to turn corner otherwise is suppressed
	 * @param no parameter
	 *  @return no return
	 */
	public boolean takeControl(){
		while ( sonar.getDistance() <= 17){
			return true;
		}
		return false;
	}
	/**
	 * turns right and scans the distance to see if it is a clear path
	 * if clear drives forward
	 * if blocked robot turns left and continues driving
	 * @param no parameter
	 *  @return no return
	 */
	public void  action (){
		//turning corner
		//blocked path so turn right
		Motor.B.stop();
		Motor.C.forward();
		Delay.msDelay(1000);

		//rescan distance to see if the robot can turn right or blocked path
		if (sonar.getDistance() <= 17){
			//path to right is blocked so robot must turn left
			Motor.C.stop();
			Motor.B.forward();
			Delay.msDelay(3500);
		}
		else{ //right path is free so robot continues
			Motor.B.forward();
			Motor.C.forward();
		}


	}
}
