package nodello;

import java.util.Scanner;
/**
 * Prints out any perfect integers(the sum of the factors add up to the number)
 * @author Alyssa Nodello
 * April 21 2017
 */
public class PerfectInt {
	/**
	 * has a loop to get the number between 1-1000 being tested for a perfect integer. Prints out the values that are perfect integers
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("The perfect integers between 1 and 1000 are:");
		for (int i = 1; i <= 1000; i++) {
			if(isPerfect(i)){
				System.out.println(i);
			}
		}	

	}
	/**
	 * sees if the number is a perfect integer by doing:
	 * divides the counter value from the main method and uses modulus to check if it is a factor. Adds up the factors to see if it adds up to the perfect int
	 * @param i
	 * @return true if the number is a perfect integer
	 */
	public static boolean isPerfect(int i){
		int sum = 0;

		for (int j = 1; j < i; j++) {
			if(i%j ==0)
				sum +=j;
		}	

		if (sum == i){           
			return true;
		}
		return false;
	}
	
}



