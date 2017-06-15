package Culminating;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * uses light sensor to see if ping pong ball is white(miner) and moves it to safety
 * lightMiner.java
 * June 15, 2017
 * @author Alyssa Nodello
 *
 */
public class lightMiner implements Behavior{
	private boolean suppressed = false;
	private LightSensor light;
	/**
	 * 
	 * @param light
	 */
	public lightMiner(LightSensor light){
		this.light = light;
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
		//scans to see if the colour of the ping pong ball is white
		if (light.getLightValue() > 40 && light.getLightValue() < 45){ // the ping pong ball is white so is a miner to be saved
			return true;
		}
		return false;
		
	}
	/**
	 * no parameter
	 */
	public void  action (){
		//moves the ping pong ball to the safety pad	
		Motor.B.stop();//stops robot
		Motor.C.stop();
		Delay.msDelay(500);
		//use motor a as arm to scoop the ball by pushing arm down around ball
		Motor.A.rotate(135);
		//half rotation to turn to white pad
		Motor.C.forward();
		Delay.msDelay(1500);
		Motor.C.stop();
		//move motor a to release ball by lifting arm
		Motor.A.rotate(-135);
		//half rotation back to face area with balls
		Motor.B.forward();
		Delay.msDelay(250);
		Motor.B.stop();
//		while (!suppressed){
//			Thread.yield();
//		}
	}
}
