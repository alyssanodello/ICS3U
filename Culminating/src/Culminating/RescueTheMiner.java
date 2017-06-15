package Culminating;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
/**
 * RescueTheMiner.java
 * Main method that holds array of behaviors and their priorities
 * June 9, 2017
 * @author Alyssa Nodello
 *
 */
public class RescueTheMiner {
	/**
	 * holds the behaviors, the array of the behaviors and initializes sensors
	 * @param args
	 * @return no return
	 */
	public static void main(String [] args){

		LightSensor light = new LightSensor(SensorPort.S3); //initialize light sensor
		UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S1); //initialize light sensor
		
		Behavior b1 = new closeToWall(sonar);
		Behavior b2 = new driveForward();
		Behavior b3 = new exitProgram();
		Behavior b4 = new lightRocks(light);
		Behavior b5 = new lightMiner(light);


		Behavior[] behaviors = {b2, b1, b4, b5, b3}; //lowest to highest priority

		Arbitrator arby = new Arbitrator(behaviors);
		arby.start();

	}
}

 