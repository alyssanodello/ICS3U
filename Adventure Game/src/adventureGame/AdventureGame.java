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
		BufferedImage basement1 = null;
		BufferedImage basement2 = null;
		BufferedImage handCuffs = null;
		BufferedImage keypad = null;
		BufferedImage laserSecurity = null;
		BufferedImage museum1 = null;
		BufferedImage museum2 = null;
		BufferedImage museum5 = null;
		BufferedImage phoneCall = null;
		BufferedImage security2 = null;
		BufferedImage security5 = null;
		Clip attack = null;
		Clip doorknob = null;
		Clip breathing = null;
		Clip helicopter = null;
		Clip keyboard = null;
		Clip siren = null;
		Clip punches = null;
		boolean escaped = false;

		do {
			try {
				outside = ImageIO.read(new File("AdventureGame/outsidemuseum.jpg"));
			} catch (IOException e) {
				System.err.println("There was an error loading the image.");
				e.printStackTrace();
			}

			try {
				keyboard = AudioSystem.getClip();
				keyboard.open(AudioSystem.getAudioInputStream(new File("AdentureGameAudio/keyboard.wav")));

			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				attack = AudioSystem.getClip();
				attack.open(AudioSystem.getAudioInputStream(new File("AdentureGameAudio/attack.wav")));

			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				doorknob = AudioSystem.getClip();
				doorknob.open(AudioSystem.getAudioInputStream(new File("AdentureGameAudio/doorknob.wav")));

			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				breathing = AudioSystem.getClip();
				breathing.open(AudioSystem.getAudioInputStream(new File("AdentureGameAudio/heavybreathing.wav")));

			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				helicopter = AudioSystem.getClip();
				helicopter.open(AudioSystem.getAudioInputStream(new File("AdentureGameAudio/helicopter.wav")));

			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				siren = AudioSystem.getClip();
				siren.open(AudioSystem.getAudioInputStream(new File("AdentureGameAudio/Police_Siren.wav")));

			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				punches = AudioSystem.getClip();
				punches.open(AudioSystem.getAudioInputStream(new File("AdentureGameAudio/punches.wav")));

			} catch (Exception e) {
				e.printStackTrace();
			}

			c.drawImage(outside, 0, 0, null);

			c.println(
					"Welcome to Museum Mayhem! \nIn this game your mission is to escape the museum you just robbed. \nYou've entered through the roof but your ropes and equipment all broke. It's up to you to escape without being caught.");

			c.println("Which three items do you want to steal?(type each item name one at a time)");
			c.println("Bedazzled Gun");
			c.println("Royal Crown");
			c.println("Golden Dagger");
			c.println("Ancient Vase");
			c.println("Ruby Necklace");
			c.println(" ");

			// array to hold these items
			String[] items = new String[3];
			for (int i = 0; i < items.length; i++) {
				items[i] = c.readLine().toLowerCase(); // saves the items that they stole into array
				while (!(items[i].equals("bedazzled gun") || items[i].equals("royal crown")
						|| items[i].equals("golden dagger") || items[i].equals("ancient vase")
						|| items[i].equals("ruby necklace"))) {
					c.println("Invalid answer please answer again"); // while loop for spell check
					items[i] = c.readLine().toLowerCase();
				}
			}
			c.clear();
			try {
				phoneCall = ImageIO.read(new File("AdventureGame/phoneCall.jpg"));
			} catch (IOException e) {
				System.err.println("There was an error loading the image.");
				e.printStackTrace();
			}
			c.drawImage(phoneCall, 0, 0, null);

			c.println(
					"Your friend calls to tell you that his car broke down and he can't pick you up anymore. \nHe says his friend can pick you up in his helicopter but you have to wait 30 mins. \nDo you want to wait for the helicopter or make a run for it? (run/wait)");
			String run = c.readLine().toLowerCase(); // left side of flowchart
			while (!(run.equals("run") || run.equals("wait"))) {
				c.println("Invalid answer please answer again");
				run = c.readLine().toLowerCase();
			}
			if (run.equals("run")) {
				c.clear();
			
				
				try {
					laserSecurity = ImageIO.read(new File("AdventureGame/laserSecurity.jpg"));
				} catch (IOException e) {
					System.err.println("There was an error loading the image.");
					e.printStackTrace();
				}
				c.drawImage(laserSecurity, 0, 0, 1200, 1000, null);

				c.println(
						"You begin to run but you see lasers ahead. Do you try to run through them or deactivate it?(pass/deactivate)");
				
				breathing.loop(Clip.LOOP_CONTINUOUSLY);
				Thread.sleep(4000);
				breathing.stop();
				String pass = c.readLine().toLowerCase();
				while (!(pass.equals("pass") || pass.equals("deactivate"))) {
					c.println("Invalid answer please answer again");
					pass = c.readLine().toLowerCase();
				}
				if (pass.equals("pass")) {
					c.clear();
					double num = Math.random(); // random number generator 50% chance of getting through lasers
					if (num < 0.5) {
						// survives entering lasers
						try {
							museum5 = ImageIO.read(new File("AdventureGame/museum5.jpg"));
						} catch (IOException e) {
							System.err.println("There was an error loading the image.");
							e.printStackTrace();
						}
						c.drawImage(museum5, 0, 0, null);

						c.println(
								"You successfully make it through the lasers. You start running but you see guards ahead. Do you run past them or trip them? (run/trip)");
						String trip = c.readLine().toLowerCase();
						while (!(trip.equals("trip") || trip.equals("run"))) {
							c.println("Invalid answer please answer again");
							trip = c.readLine().toLowerCase();
						}
						if (trip.equals("trip")) {
							c.clear();
							attack.loop(Clip.LOOP_CONTINUOUSLY);
							
							try {
								museum1 = ImageIO.read(new File("AdventureGame/museum1.jpg"));
							} catch (IOException e) {
								System.err.println("There was an error loading the image.");
								e.printStackTrace();
							}
							Thread.sleep(3000);
							attack.stop();
							c.drawImage(museum1, 0, 0, null);

							c.println(
									"You managed to trip the guards and quickly run down the hallway. There's a fork in the path, do you go right or left? (right/left)");
							String right = c.readLine().toLowerCase();
							while (!(right.equals("right") || right.equals("left"))) {
								c.println("Invalid answer please answer again");
								right = c.readLine().toLowerCase();
							}
							if (right.equals("right")) {
								c.clear();
								try {
									handCuffs = ImageIO.read(new File("AdventureGame/handCuffs.jpg"));
								} catch (IOException e) {
									System.err.println("There was an error loading the image.");
									e.printStackTrace();
								}
								c.drawImage(handCuffs, 0, 0, null);
								siren.loop(Clip.LOOP_CONTINUOUSLY);
								Thread.sleep(2000);
								siren.stop();

								c.println("You run into the police and get caught. You failed the mission."); // end of mission

								c.println("Although unsuccessful, you almost stole:");
								for (int i = 0; i < items.length; i++) {
									c.println(items[i]);
								}

							} else {
								c.drawImage(outside, 0, 0, null);
								c.println(
										"You manage to escape the museum unharmed. Mission accomplished! You successfully stole:"); // end of mission

								for (int i = 0; i < items.length; i++) {
									c.println(items[i]);
								}
							}
							
						} else {
							c.clear();
							try {
								handCuffs = ImageIO.read(new File("AdventureGame/handCuffs.jpg"));
							} catch (IOException e) {
								System.err.println("There was an error loading the image.");
								e.printStackTrace();
							}
							c.drawImage(handCuffs, 0, 0, null);
							c.println("The guards see you and catch you. Mission unsuccessful.");// end of mission
							siren.loop(Clip.LOOP_CONTINUOUSLY);
							Thread.sleep(2000);
							siren.stop();
							c.println("Although unsuccessful, you almost stole:");
							for (int i = 0; i < items.length; i++) {
								c.println(items[i]);
							}
						}
					} 
					else {
						try {
							handCuffs = ImageIO.read(new File("AdventureGame/handCuffs.jpg"));
						} catch (IOException e) {
							System.err.println("There was an error loading the image.");
							e.printStackTrace();
						}
						c.drawImage(handCuffs, 0, 0, null);
						siren.loop(Clip.LOOP_CONTINUOUSLY);
						Thread.sleep(2000);
						siren.stop();
						c.println(
								"You didnt make it though the laser security. The guards caught you. Mission unsuccessful."); // end of mission
						c.println("Although unsuccessful, you almost stole:");
						for (int i = 0; i < items.length; i++) {
							c.println(items[i]);
						}
					}
				} else {// deactivating
					c.clear();
					try {
						keypad = ImageIO.read(new File("AdventureGame/keypad.jpg"));
					} catch (IOException e) {
						System.err.println("There was an error loading the image.");
						e.printStackTrace();
					}
					c.drawImage(keypad, 0, 0, 900, 900, null);
					c.println(
							"There is a keypad on the wall to deactivate the lasers. This is protected with a riddle. The riddle is: What goes up, and doesn't go back down? Hint: the answer is a three letter word. \nYou have 3 chances to guess");
					int counter = 0;
					while (counter <= 2) {
						String answer = c.readLine().toLowerCase();
						keyboard.loop(Clip.LOOP_CONTINUOUSLY);
						Thread.sleep(2000);
						keyboard.stop();
						if (answer.equals("age")) {
							c.clear();
							c.drawImage(outside, 0, 0, null);
							c.println(
									"The lasers have deactivated and you safely escape the museum. Mission accomplished! You successfully stole:"); // end of mission
							for (int i = 0; i < items.length; i++) {
								c.println(items[i]);
								
							}
							break;
						} else {
							c.println("That was incorrect. Try again.");
							counter = counter + 1;

						}

					}
				}

			} else {
				c.clear();
				try {
					museum2 = ImageIO.read(new File("AdventureGame/museum2.jpg"));
				} catch (IOException e) {
					System.err.println("There was an error loading the image.");
					e.printStackTrace();
				}
				c.drawImage(museum2, 0, 0, null);
				// right side of flowchart (helicopter)
				c.println("Do you want to wait upstairs or downstairs? (up/down)");
				String up = c.readLine().toLowerCase();
				while (!(up.equals("up") || up.equals("down"))) {
					c.println("Invalid answer please answer again");
					up = c.readLine().toLowerCase();
				}
				if (up.equals("up")) {
					c.clear();
					try {
						phoneCall = ImageIO.read(new File("AdventureGame/phonecall.jpg"));
					} catch (IOException e) {
						System.err.println("There was an error loading the image.");
						e.printStackTrace();
					}
					c.drawImage(phoneCall, 0, 0, null);
					c.println("Your phone begins to ring but it's an unknown number. Do you pick up? (yes/no)");
					String phone = c.readLine().toLowerCase();
					while (!(phone.equals("yes") || phone.equals("no"))) {
						c.println("Invalid answer please answer again");
						phone = c.readLine().toLowerCase();
					}
					if (phone.equals("yes")) {
						c.clear();
						siren.loop(Clip.LOOP_CONTINUOUSLY);
						try {
							handCuffs = ImageIO.read(new File("AdventureGame/handCuffs.jpg"));
						} catch (IOException e) {
							System.err.println("There was an error loading the image.");
							e.printStackTrace();
						}
						c.drawImage(handCuffs, 0, 0, null);
						siren.loop(Clip.LOOP_CONTINUOUSLY);
						Thread.sleep(2000);
						siren.stop();
						c.println("The cops were calling you and you got busted! You failed the mission."); // end of mission
						c.println("Although unsuccessful, you almost stole:");
						for (int i = 0; i < items.length; i++) {
							c.println(items[i]);
						}
						Thread.sleep(3000);
						siren.stop();
					} else {
						helicopter.loop(Clip.LOOP_CONTINUOUSLY);
						try {
							outside = ImageIO.read(new File("AdventureGame/outsidemuesuml.jpg"));
						} catch (IOException e) {
							System.err.println("There was an error loading the image.");
							e.printStackTrace();
						}
						c.drawImage(outside, 0, 0, null);
						c.println(
								"The helicopter guy called you and you escape the museum. Mission accomplished! You successfully stole:"); // end of mission
						for (int i = 0; i < items.length; i++) {
							c.println(items[i]);
						}
						Thread.sleep(3000);
						helicopter.stop();
					}
				} else {
					c.clear();
					try {
						keypad = ImageIO.read(new File("AdventureGame/keypad.jpg"));
					} catch (IOException e) {
						System.err.println("There was an error loading the image.");
						e.printStackTrace();
					}
					c.drawImage(keypad, 0, 0, 900, 900, null);
					keyboard.loop(Clip.LOOP_CONTINUOUSLY);
					c.println(
							"You go downstairs to the basement but it is protected by a keypad. Can you guess the code? \n30/5+4*(-2)= \nYou have 3 chances");
					double math;
					try {
						math = Double.parseDouble(c.readLine());
					} catch (Exception e) {
						c.println("Please enter a number digit");
						math = -1;
					}
					Thread.sleep(2000);
					keyboard.stop();
					int counter1 = 0;
					while (counter1 < 2) {

						if (math == 0) {
							c.clear();
							try {
								basement1 = ImageIO.read(new File("AdventureGame/basement1.jpg"));
							} catch (IOException e) {
								System.err.println("There was an error loading the image.");
								e.printStackTrace();
							}
							c.drawImage(basement1, 0, 0, null);

							c.println(
									"You get into the basement but now you have to wait 30 mins for the helicopter. \nThe time has passed and you get a text from the pilot. \nYou realize you have bad service since you're unable to text him back. Do you go upstairs to receive service or stay downstairs? (up/stay)");
							String cell = c.readLine().toLowerCase();
							while (!(cell.equals("stay") || cell.equals("up"))) {
								c.println("Invalid answer please answer again");
								cell = c.readLine().toLowerCase();
							}
							if (cell.equals("stay")) {
								c.clear();
								try {
									security5 = ImageIO.read(new File("AdventureGame/security5.jpg"));
								} catch (IOException e) {
									System.err.println("There was an error loading the image.");
									e.printStackTrace();
								}
								c.drawImage(security5, 0, 0, 1200, 800, null);
								c.println(
										"A guard enters the basement. Do you hide or try to fight them? (hide/fight)");
								String hide = c.readLine().toLowerCase();
								while (!(hide.equals("hide") || hide.equals("fight"))) {
									c.println("Invalid answer please answer again");
									hide = c.readLine().toLowerCase();
								}
								if (hide.equals("hide")) {
									c.clear();
									try {
										basement2 = ImageIO.read(new File("AdventureGame/basement2.jpg"));
									} catch (IOException e) {
										System.err.println("There was an error loading the image.");
										e.printStackTrace();
									}
									c.drawImage(basement2, 0, 0, null);
									doorknob.loop(Clip.LOOP_CONTINUOUSLY);
									c.println(
											"You enter a room but you can't open it from the inside. You get locked inside until a guard finds you. Mission unsuccessful."); // end
									// of
									// mission
									siren.loop(Clip.LOOP_CONTINUOUSLY);
									Thread.sleep(2000);
									siren.stop();
									c.println("Although unsuccessful, you almost stole:");
									for (int i = 0; i < items.length; i++) {
										c.println(items[i]);
									}
									Thread.sleep(2000);
									doorknob.stop();
									break;
								} else {
									c.clear();
									try {
										handCuffs = ImageIO.read(new File("AdventureGame/handCuffs.jpg"));
									} catch (IOException e) {
										System.err.println("There was an error loading the image.");
										e.printStackTrace();
									}
									c.drawImage(handCuffs, 0, 0, null);
									siren.loop(Clip.LOOP_CONTINUOUSLY);
									Thread.sleep(2000);
									siren.stop();
									c.println("You lose the fight again the guard. You almost stole:");
									for (int i = 0; i < items.length; i++) {
										c.println(items[i]);
									}
									break;
								}

							}

							else {// going upstairs for cell service
								c.clear();
								double chance = Math.random(); // random number generator 50% chance of getting caught
								if (chance < 0.5) {
									helicopter.loop(Clip.LOOP_CONTINUOUSLY);
									try {
										outside = ImageIO.read(new File("AdventureGame/outsidemuseum.jpg"));
									} catch (IOException e) {
										System.err.println("There was an error loading the image.");
										e.printStackTrace();
									}
									c.drawImage(outside, 0, 0, null);
									c.println("You manage to escape the museum safely on the helicopter. Mission accomplished! You successfully stole:"); // end of mission
									for (int i = 0; i < items.length; i++) {
										c.println(items[i]);
									}
									Thread.sleep(3000);
									helicopter.stop();
									break;
								} else {
									try {
										museum5 = ImageIO.read(new File("AdventureGame/museum5.jpg"));
									} catch (IOException e) {
										System.err.println("There was an error loading the image.");
										e.printStackTrace();
									}
									c.drawImage(museum5, 0, 0, null);
									c.println("You see guards and decide to fight them off.");
									boolean found = false;
									for (int i = 0; i < items.length; i++) {
										if (items[i].equals("golden dagger") || items[i].equals("bedazzled gun")) {
											c.println("You manage to win the fight with " + items[i]);
											c.drawImage(outside, 0, 0, null);
											c.println("You successfully escape the museum! You managed to steal:"); // end of mission

											c.println(items[0]);
											c.println(items[1]);
											c.println(items[2]);
											found = true;
											escaped = true;
											break;
										}
									}

									if (escaped) {
										break;
									}

									if (!found) {
										punches.loop(Clip.LOOP_CONTINUOUSLY);
										try {
											security2 = ImageIO.read(new File("AdventureGame/security2.jpg"));
										} catch (IOException e) {
											System.err.println("There was an error loading the image.");
											e.printStackTrace();
										}
										c.drawImage(security2, 0, 0, null);
										c.println(
												"You try to fight the guards with your fists due to the lack of weapons you have and fail. You almost stole:");
										for (int i = 0; i < items.length; i++) {
											c.println(items[i]);
										}
										Thread.sleep(4000);
										punches.stop();
									}

								}
							}
						} else {
							c.println("That was incorrect, try again.");
							// counter1 = counter1 + 1;
							try {
								math = Double.parseDouble(c.readLine());
								counter1++;
							} catch (Exception e) {
								c.println("Please enter a number digit");
								math = -1;
							}
						}

					}
					if (!escaped) {
						siren.loop(Clip.LOOP_CONTINUOUSLY);
						Thread.sleep(2000);
						siren.stop();
						try {
							handCuffs = ImageIO.read(new File("AdventureGame/handCuffs.jpg"));
						} catch (IOException e) {
							System.err.println("There was an error loading the image.");
							e.printStackTrace();
						}
						c.drawImage(handCuffs, 0, 0, null);
						c.println(
								"You failed the mission. You almost stole:"); // end of mission
						for (int i = 0; i < items.length; i++) {
							c.println(items[i]);
						}
					}
				}
			}

			c.print("Do you want to play again?(y/n)"); // play again or restart the game
			playagain = c.readLine().toLowerCase();
			while (!(playagain.equals("y") || playagain.equals("n"))) {
				c.println("Invalid answer please answer again");
				playagain = c.readLine().toLowerCase();
				c.clear();
			}
			c.clear();
		} while (playagain.equals("y"));
		c.close();

	}

}
