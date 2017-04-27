package kemp;

import java.util.Scanner;

/**
 * 
 * @author Alyssa April 24, 2017
 */
public class Life {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean[][]change = new boolean[20][20];
		char[][] field = new char[20][20];
		for (int i = 0; i < 20; i++) {

			for (int n = 0; n < 20; n++) {

				field[n][i] = 'O';
			}
		}
		// variables
		int row = 0;
		int column = 0;
		int neighbour = 0;

		System.out.println("How many live cells would you like to start with?");
		int startCells = sc.nextInt();

		System.out.println("Please enter the x and y coordinate of where you want the cells to begin on the 20x20 grid");

		for (int s = 0; s < startCells; s++) {
			System.out.println("Row coordinate #" + (s + 1));

			row = sc.nextInt();

			System.out.println("Column coordinate #" + (s + 1));
			column = sc.nextInt();
			field[row][column] = 'X';

		}
		for (int x = 0; x < 20; x++) {

			for (int y = 0; y < 20; y++) {

				System.out.print(field[x][y] + " ");
			}
			System.out.println();
		}
		
		for (int x = 0; x < 20; x++) {

			neighbour = 0;
			for (int y = 0; y < 20; y++) {

				if (field[x][y] == 'X') {

					
					 // check one to the right of y
			        if (field[x].length > y + 1) {
			            if (field[x][y + 1] == 'X') {
			                neighbour++;
			            }
			        }
			        // check one to the left of y
			        if (field[x].length > y - 1 && y - 1 >= 0) {
			            if (field[x][y - 1] == 'X') {
			                neighbour++;
			            }
			        }

			        // check one above y
			        if (field.length > x - 1 && x - 1 >= 0) {
			            if (field[x - 1][y] == 'X') {
			                neighbour++;
			            }
			        }

			        // check one below y
			        if (field.length > x + 1) {
			            if (field[x + 1][y] == 'X') {
			                neighbour++;
			            }
			        }

			        // check one top left diagonal to y
			        if (field.length > x - 1 && field[x].length > y - 1 && x - 1 >= 0 && y - 1 >= 0) {
			            if (field[x - 1][y - 1] == 'X') {
			                neighbour++;
			            }
			        }

			        // check one top right diagonal to y
			        if (field.length > x - 1 && field[x].length > y + 1 && x - 1 >= 0) {
			            if (field[x - 1][y + 1] == 'X') {
			                neighbour++;
			            }
			        }

			        // check one bottom left diagonal to y
			        if (field.length > x + 1 && field[x].length > y - 1 && y - 1 >= 0) {
			            if (field[x + 1][y - 1] == 'X') {
			                neighbour++;
			            } 
			        }

			        // check one bottom right diagonal to y
			        if (field.length > x + 1 && field[x].length > y + 1) {
			            if (field[x + 1][y + 1] == 'X') {
			                neighbour++;
			            }
			        }
//					if (field.length >= x - 1 && field[x].length >= y - 1 && y - 1 >= 0 && x - 1 >= 0) {
//						
//					}
//
//					if (field[x - 1][y - 1] == 'X') {
//						neighbour++;
//					}
//					if (field[x][y - 1] == 'X') {
//						neighbour++;
//					}
//					if (field[x + 1][y - 1] == 'X') {
//						neighbour++;
//					}
//					if (field[x - 1][y] == 'X') {
//						neighbour++;
//					}
//					
//					
//					if (field[x + 1][y] == 'X') {
//						neighbour++;
//					}
//					if (field[x - 1][y + 1] == 'X') {
//						neighbour++;
//					}
//					if (field[x][y + 1] == 'X') {
//						neighbour++;
//					}
//					if (field[x + 1][y + 1] == 'X') {
//						neighbour++;
//					}
//
//					if (neighbour < 2) {
//						field[x][y] = 'O';
//					}
			        
			        
				}
				else {
					// cell is dead at start
					
				}
				
				System.out.printf("Neighbour for %d,%d is %d\n", x, y, neighbour);

				  if (neighbour == 2 || neighbour == 3) {
						field[x][y] = 'X';
					} 
					else if (neighbour <= 1 || neighbour > 3) {
						field[x][y] = 'O';
					}
			        			
			
			}

		}

		System.out.println(" ");
		System.out.println("Generation 1");
		System.out.println(" ");
		for (int x = 0; x < 20; x++) {

			for (int y = 0; y < 20; y++) {

				System.out.print(field[x][y] + " ");
			}
			System.out.println();
		}

	}
}
// if type in one live cell it doesnt work
// for checking make exception for row and column 0 and 20
