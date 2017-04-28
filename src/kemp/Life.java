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
		boolean[][]change = new boolean[20][20]; // boolean array holds if a change was made or not
		char[][] field = new char[20][20]; //field constant 
		for (int x = 0; x < 20; x++) {

			for (int y = 0; y < 20; y++) {

				field[x][y] = 'O';
				change[x][y] = false;
			}
		}
		// variables
		int row = 0;
		int column = 0;
		int neighbour = 0;
		int generation = 1;
		String ans = "yes";
		int livecell = 0;

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
		for (int x = 0; x < 20; x++) {

			for (int y = 0; y < 20; y++) {

				System.out.print(field[x][y] + " ");
			}
			System.out.println();
		}
		//loop for multiple generations
		do{

			//loop that checks neighbours
			for (int x = 0; x < 20; x++) {

				neighbour = 0;
				for (int y = 0; y < 20; y++) {
					neighbour = 0; 
					if (field[x][y] == 'X') {
						//cell is alive at start

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
						//assigns true if the cell will stay alive
						if (neighbour == 2 || neighbour == 3) {
							change[x][y] = true;
						} 
						else if (neighbour <= 1 || neighbour > 3) {
							change[x][y] = false;
						}

					}
					else {
						// cell is dead at start
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
						if ( neighbour == 3) {
							change[x][y] = true;
						} 
						else {
							change[x][y] = false;
						}

					}

				}

			}

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
			if(livecell == 0){
				System.out.println("No more live cells");
			}
			System.out.println("Would you like to see the next generation? (yes/no)");
			ans = sc.next();
			generation ++;
		}while(ans.equalsIgnoreCase("yes"));
		System.out.print("Program Over");
	}
}


