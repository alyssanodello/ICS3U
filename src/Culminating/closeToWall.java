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
 * uses ultrasonic sensor to see how close the robot is to the maze walls are turn around corners if too close.
 */
public class closeToWall implements Behavior {
	private boolean suppressed = false;
	private UltrasonicSensor sonar;
	/**
	 * 
	 * @param us
	 */
	public closeToWall(UltrasonicSensor us){
		this.sonar = us;
	}
	/**
	 * no parameter
	 */
	public void suppress(){
		suppressed = true;
	}
	/**
	 * no parameter
	 */
	public boolean takeControl(){
		//scanning to see distance from wall
		// if closer than 15cm away robot will run the action code to turn corner

		while ( sonar.getDistance() <= 17){
			return true;
		}
		return false;
	}
	/**
	 * no parameter
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
//		while (!suppressed){
//			Thread.yield();
//		}

	}
}
