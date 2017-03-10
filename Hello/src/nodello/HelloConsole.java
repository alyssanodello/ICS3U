package nodello;

import java.awt.Color;

import hsa_new.Console;

public class HelloConsole {

	public static void main(String[] args) {
		Console c = new Console(); 
		c.setTextColor(Color.cyan);
		c.setColor(Color.MAGENTA);
		c.setTextBackgroundColor(Color.BLACK);
		c.clear();
		c.println("MAGICCCC");
		c.println("Do you like magic");
		String answer= c.readLine();
		
		if (answer.equals("yes")) {
			c.drawStar(150, 150, 150, 150);
			c.fillStar(100, 100, 100, 100);
			c.setColor(Color.ORANGE);
			c.drawStar(75, 75, 75, 75);
			c.setColor(Color.GREEN);
			c.drawStar(50, 50, 50, 50);
			c.drawStar(40, 40, 40, 40);
			c.setColor(Color.YELLOW);
			c.drawStar(25, 25, 25, 25);
			c.fillStar(300, 300, 25, 25);
		}
			
			else {
				c.println("You suck");
			}
		
		 
		
	}

}
