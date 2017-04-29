package kemp;

import java.util.Scanner;

/**
 * Game of Life
 * @author Alyssa 
 * April 24, 2017
 */
public class Life {
	/**
	 * Main method that holds all the code
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean[][]change = new boolean[20][20]; // boolean array holds if a change was made or not
		char[][] field = new char[20][20]; //field constant 
		for (int x = 0; x < 20; x++) {

			for (int y = 0; y < 20; y++) {
				//codes the initial board before the user inputs where they want cells  
				field[x][y] = 'O'; // O is a dead cell
				change[x][y] = false;
			}
		}
		// variables
		int row = 0; //for user input
		int column = 0;//for user input
		int neighbour = 0;//counter
		int generation = 1;//counts number of generations
		String ans = "yes";//for seeing the next generation
		int livecell = 0; //the number of live cells after each generation so the program knows whether there will be another round

		System.out.println("How many live cells would you like to start with?");
		int startCells = sc.nextInt();
		if (startCells <=0)
		{
			System.out.print("Please enter a number greater than 0");
			startCells = sc.nextInt();
		}

		System.out.println("Please enter the x and y coordinate of where you want the cells to begin on the 20x20 grid");

		for (int s = 0; s < startCells; s++) {
			System.out.println("Row coordinate #" + (s + 1));

			row = sc.nextInt();

			System.out.println("Column coordinate #" + (s + 1));
			column = sc.nextInt();
			field[row][column] = 'X';

		}
		//prints out first field with user input
		for (int x = 0; x < 20; x++) {

			for (int y = 0; y < 20; y++) {

				System.out.print(field[x][y] + " ");
			}
			System.out.println();
		}
		//loop for printing multiple generations
		do{

			//loop that checks neighbours
			for (int x = 0; x < 20; x++) {

				neighbour = 0;//resets number of neighbours
				for (int y = 0; y < 20; y++) {
					neighbour = 0; //resets number of neighbours

					// check if there is a neighbour on top right
					if (x > 0 && y < 19 && field[x-1][y+1] == 'X')
						neighbour++;

					// check if there is a neighbour on top middle
					if (x > 0 && field[x-1][y] == 'X')
						neighbour++;

					// check if there is a neighbour on top left
					if (x > 0 && y > 0 && field[x-1][y-1] == 'X')
						neighbour++;

					// check if there is a neighbour on right
					if (y < 19 && field[x][y+1] == 'X')
						neighbour++;

					// check if there is a neighbour on left
					if (y > 0 && field[x][y-1] == 'X')
						neighbour++;

					// check if there is a neighbour on bottom right
					if (x < 19 && y < 19 && field[x+1][y+1] == 'X')
						neighbour++;

					// check if there is a neighbour on bottom middle
					if (x < 19 && field[x+1][y] == 'X')
						neighbour++;

					// check if there is a neighbour on bottom left
					if (x < 19 && y > 0 && field[x+1][y-1] == 'X')
						neighbour++;	

						
					//assigns true if the cell will stay alive
					if(field[x][y]== 'X'){
						if (neighbour == 2 || neighbour == 3) {
							change[x][y] = true;
						} 
						else if (neighbour <= 1 || neighbour > 3) {
							change[x][y] = false;
						}

					}
					//assigns true if the cell comes to life
					if(field[x][y]== 'O'){
						if ( neighbour == 3) {
							change[x][y] = true;
						} 
						else {
							change[x][y] = false;
						}

					}

				}

			}
			//prints out next generation
			System.out.println(" ");
			System.out.println("Generation #" +generation);
			System.out.println(" ");
			for (int x = 0; x < 20; x++) {

				for (int y = 0; y < 20; y++) {
					if(change[x][y] == true){
						field[x][y] = 'X';
						System.out.print(field[x][y] + " ");
					}
					else{
						field[x][y] = 'O';
						System.out.print(field[x][y] + " ");
					}

				}
				System.out.println();
			}
			//checks if there are live cells
			for (int x = 0; x < 20; x++) {

				for (int y = 0; y < 20; y++) {

					if(field[x][y] == 'X'){
						livecell++;
					}
				}
			}
			if(livecell <3 ){//checks if under 3 because if only 2 cells left they wont have enough neighbours to survive the next generation
				System.out.println("No more live cells");
				System.out.print("Game of Life is over");
				System.exit(0);
			}
			System.out.println("Would you like to see the next generation? (yes/no)");
			ans = sc.next();
			generation ++;
		}while(ans.equalsIgnoreCase("yes"));
		System.out.print("Game of Life is over");
	}
}