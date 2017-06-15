package Culminating;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class exitProgram  implements Behavior{

	public void suppress(){
	}

	public boolean takeControl(){
		if(Button.ESCAPE.isDown()){
			return true;
		}
		return false;
	}

	public void action(){
		System.exit(0);
	}
}
