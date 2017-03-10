package adventureGame;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import hsa_new.Console;


/**
 * AdventureGame.java A finish your own story game about robbing a museum
 * February 27, 2017
 * 
 * @author Elizabeth Nguyen and Alyssa Nodello
 */

public class AdventureGame {

	public static void main(String[] args) throws InterruptedException {
		Console c = new Console(40, 150);
		String playagain;
		BufferedImage outside = null;
		BufferedImage dagger = null;
		BufferedImage gun = null;
		BufferedImage crown = null;
		BufferedImage necklace = null;
		BufferedImage vase = null;
		BufferedImage basement1 = null;
		BufferedImage basement2 = null;
		BufferedImage handcuffs = null;
		BufferedImage keypad = null;
		BufferedImage lasersecurity = null;
		BufferedImage museum1 = null;
		BufferedImage museum2 = null;
		BufferedImage museum3 = null;
		BufferedImage museum4 = null;
		BufferedImage museum5 = null;
		BufferedImage phonecall = null;
		BufferedImage security = null;
		BufferedImage security2 = null;
		BufferedImage security3 = null;
		BufferedImage security4 = null;
		BufferedImage security5 = null;
		BufferedImage security6 = null;
		BufferedImage security7 = null;
		Clip attack = null;
		Clip doorknob = null;
		Clip breathing = null;
		Clip helicopter = null;
		Clip keyboard = null;
		Clip siren = null;
		Clip punches = null;



		do {
			try {
				outside = ImageIO.read(new File("AdventureGame/outsidemuseum.jpg"));
			} catch (IOException e) {
				System.err.println("There was an error loading the image.");
				e.printStackTrace();
			}
			
			try{
				keyboard = AudioSystem.getClip();
				keyboard.open(AudioSystem.getAudioInputStream(new File("keyboard.wav")));

			}catch  (Exception e) {
				e.printStackTrace();
			}
			c.drawImage(outside, 0, 0, null);


			c.println("Welcome to Museum Mayhem! \nIn this game your mission is to escape the museum you just robbed. \nYou've entered through the roof but your ropes and equipment all broke. It's up to you to escape without being caught.");

			c.println("Which three items do you want to steal?(type each item name one at a time)");
			c.println("Bedazzled Gun");
			c.println("Royal Crown");
			c.println("Golden Dagger");
			c.println("Ancient Vase");
			c.println("Ruby Necklace");
			c.println(" ");

			///array to hold these items
			String []items = new String[3];
			for (int i = 0; i < items.length; i++)
			{
				items[i] = c.readLine().toLowerCase(); // saves the items that they stole into an array
				while(!(items[i].equals("bedazzled gun") || items[i].equals("royal crown") || items[i].equals("golden dagger") || items[i].equals("ancient vase") || items[i].equals("ruby necklace"))){
					c.println("Invalid answer please answer again");
					items[i] = c.readLine().toLowerCase();

				}
			}
			c.clear();
			try {
				phonecall = ImageIO.read(new File("AdventureGame/phonecall.jpg"));
			} catch (IOException e) {
				System.err.println("There was an error loading the image.");
				e.printStackTrace();
			}
			c.drawImage(phonecall, 0, 0, null);

			c.println("Your friend calls to tell you that his car broke down and he can't pick you up \nanymore. \nHe says his friend can pick you up in his helicopter but you have to wait 30 mins. \nDo you want to wait for the helicopter or make a run for it? (run/wait)");									
			String run = c.readLine().toLowerCase(); // left side of flow chart
			c.clear();
			while(!(run.equals("run") || run.equals("wait"))){
				c.println("Invalid answer please answer again");
				run = c.readLine().toLowerCase();
				c.clear();
			}
			if (run.equals("run")) {

				try {
					lasersecurity = ImageIO.read(new File("AdventureGame/lasersecurity.jpg"));
				} catch (IOException e) {
					System.err.println("There was an error loading the image.");
					e.printStackTrace();
				}
				c.drawImage(lasersecurity, 0, 0, null);

				c.println("You begin to run but you see lasers ahead. Do you try to run through them or deactivate it?(pass/deactivate)");
				String pass = c.readLine().toLowerCase();
				c.clear();
				while(!(pass.equals("pass") || pass.equals("deactivate"))){
					c.println("Invalid answer please answer again");
					pass = c.readLine().toLowerCase();
					c.clear();
				}
				if (pass.equals("pass")) {

					double num = Math.random(); // random number generator 50% chance of getting through lasers
					if (num< 0.5){ 
						// survives entering lasers
						try {
							museum5 = ImageIO.read(new File("AdventureGame/museum5.jpg"));
						} catch (IOException e) {
							System.err.println("There was an error loading the image.");
							e.printStackTrace();
						}
						c.drawImage(museum5, 0, 0, null);

						c.println("You successfully make it through the lasers. You start running but you see guards ahead. Do you run past them or trip them? (run/trip)"); 
						String trip = c.readLine().toLowerCase();
						c.clear();
						while(!(trip.equals("trip") || trip.equals("run"))){
							c.println("Invalid answer please answer again");
							trip = c.readLine().toLowerCase();
							c.clear();
						}
						if (trip.equals("trip")) {
							try {
								museum1 = ImageIO.read(new File("AdventureGame/museum1.jpg"));
							} catch (IOException e) {
								System.err.println("There was an error loading the image.");
								e.printStackTrace();
							}
							c.drawImage(museum1, 0, 0, null);

							c.println("You managed to trip the guards and quickly run down the hallway. There's a fork in the path, do you go right or left? (right/left)");
							String right = c.readLine().toLowerCase();
							c.clear();
							while(!(right.equals("right") || right.equals("left"))){
								c.println("Invalid answer please answer again");
								right = c.readLine().toLowerCase();
								c.clear();
							}
							if (right.equals("right")) {
								try {
									handcuffs = ImageIO.read(new File("AdventureGame/handcuffs.jpg"));
								} catch (IOException e) {
									System.err.println("There was an error loading the image.");
									e.printStackTrace();
								}
								c.drawImage(handcuffs, 0, 0, null);
								c.println("You run into the police and get caught. You failed the mission."); //end of mission
								c.println("Although unsuccessful, you almost stole:");
								for (int i = 0; i< items.length;i++)
								{
									c.println(items[i]);
								}

							}
							else {
								c.println("You manage to escape the museum unharmed. Mission accomplished! You successfully stole:"); //end of mission
								for (int i = 0; i< items.length;i++)
								{
									c.println(items[i]);
								}
							}
						}
						else {
							try {
								handcuffs = ImageIO.read(new File("AdventureGame/handcuffs.jpg"));
							} catch (IOException e) {
								System.err.println("There was an error loading the image.");
								e.printStackTrace();
							}
							c.drawImage(handcuffs, 0, 0, null);
							c.println("The guards see you and catch you. Mission unsuccessful.");//end of mission
							c.println("Although unsuccessful, you almost stole:");
							for (int i = 0; i< items.length;i++)
							{
								c.println(items[i]);
							}
						}
					}
					else {
						try {
							handcuffs = ImageIO.read(new File("AdventureGame/handcuffs.jpg"));
						} catch (IOException e) {
							System.err.println("There was an error loading the image.");
							e.printStackTrace();
						}
						c.drawImage(handcuffs, 0, 0, null);
						c.println("You didnt make it though the laser security. The guards caught you. Mission unsuccessful."); //end of mission
						c.println("Although unsuccessful, you almost stole:");
						for (int i = 0; i< items.length;i++)
						{
							c.println(items[i]);
						}
					}
				}
				else {// deactivating
					try {
						keypad = ImageIO.read(new File("AdventureGame/keypad.jpg"));
					} catch (IOException e) {
						System.err.println("There was an error loading the image.");
						e.printStackTrace();
					}
					c.drawImage(keypad, 0, 0, null);
					c.println("There is a keypad on the wall to deactivate the lasers. This is protected with a riddle. The riddle is: What goes up, and doesn't go back down? Hint: the answer is a three letter word.");
					int counter = 0;
					while ( counter <3)
					{
						String answer = c.readLine().toLowerCase();
						c.clear();
						if (answer.equals("age")) {
							c.println("The lasers have deactivated and you safely escape the museum. Mission accomplished!"); //end of mission
							for (int i = 0; i< items.length;i++)
							{
								c.println(items[i]);
							}
						}
						else {
							c.println("That was incorrect. Try again.");
							counter = counter + 1;

						}

					}
				}


			}
			else {
				//right side of flowchart (helicopter)
				c.println("Do you want to wait upstairs or downstairs? (up/down)");
				String up = c.readLine().toLowerCase();
				c.clear();
				while(!(up.equals("up") || up.equals("down"))){
					c.println("Invalid answer please answer again");
					up = c.readLine().toLowerCase();
					c.clear();
				}
				if (up.equals("up")) {
					c.println("Your phone begins to ring but it's an unknown number. Do you pick up? (yes/no)"); //ringtone sound
					String phone = c.readLine().toLowerCase();
					c.clear();
					while(!(phone.equals("yes") || phone.equals("no"))){
						c.println("Invalid answer please answer again");
						phone = c.readLine().toLowerCase();
						c.clear();
					}
					if (phone.equals("yes")) {
						c.println("The cops were calling you and you got busted! You failed the mission."); //police siren sound, end of mission
						c.println("Although unsuccessful, you almost stole:");
						for (int i = 0; i< items.length;i++)
						{
							c.println(items[i]);
						}
					}
					else {
						c.println("The helicopter guy called you. Mission accomplished! You successfully stole:"); //end of mission
						for (int i = 0; i< items.length;i++)
						{
							c.println(items[i]);
						}
					}
				}
				else {

					keyboard.loop(Clip.LOOP_CONTINUOUSLY);
					c.println("The basement is protected by a keypad. Can you guess the code? \n30/5+4*(-2)=");
					double math;
					try{
						math = Double.parseDouble(c.readLine());
					}catch (Exception e){
						c.println("Please enter a number digit");
						math = -1;
					}
					Thread.sleep(2000);
					keyboard.stop();
					int counter1 = 0;
					while(counter1 < 3){


						if (math == 0) {
							c.clear();
							c.println("You get into the basement but now you have to wait 30 mins for the helicopter. \nThe time has passed and you get a text from the pilot. \nYou realize you have bad service since you're unable to text him back. Do you go upstairs to receive service or stay downstairs? (up/stay)");
							String cell = c.readLine().toLowerCase();
							if(cell.equals("stay")){
								c.println("A guard enters the basement. Do you hide or try to fight them? (hide/fight)");
								String hide = c.readLine().toLowerCase();
								if (hide.equals("hide")) {
									c.println("You enter a room but you can't open it from the inside. You get locked inside until a guard finds you. Mission unsuccessful."); //end of mission

								}


							}

							else {//going upstairs for cell service
								double chance = Math.random(); // random number generator 50% chance of getting caught
								if (chance < 0.5){ 
									c.println("You manage to escape the museum safely on the helicopter. Mission accomplished! You successfully stole:"); //end of mission
									for (int i = 0; i< items.length;i++)
									{
										c.println(items[i]);
									}
								}
								else {
									c.println("You see guards and decide to fight them off.");
									boolean found = false;
									for (int i = 0; i < items.length;i++)
									{
										if (items[i].equals("golden dagger") || items[i].equals("bedazzled gun")){
											c.println("You manage to win the fight with " + items[i]);
											c.println("You succesfully escape the museum.");
											c.println(items[0]);
											c.println(items[1]);
											c.println(items[2]);
											found = true;
											break;
										}
									}
									if(!found){
										c.println("You failed the mission. You almost stole:");
										for (int i = 0; i< items.length;i++)
										{
											c.println(items[i]);
										}
									}


								}
							}
						}
						else{
							c.println("That was incorrect, try again."); 
							counter1 = counter1 +1;
							math = c.readDouble();
						}

					}
					c.println("You're out of guesses and set off the alarms. You failed the mission. You almost stole:");
					for (int i = 0; i< items.length;i++)
					{
						c.println(items[i]);
					}
				}
			}



			c.print("Do you want to play again?(y/n)");// how to make all the endings play this message?
			playagain = c.readLine().toLowerCase(); 
			while(!(playagain.equals("y") || playagain.equals("n"))){
				c.println("Invalid answer please answer again");
				playagain = c.readLine().toLowerCase();
				c.clear();
			}

		}while (playagain.equals("y"));
		c.close();

	} 





}
//to do list
//photos and sounds
// fancy typing



