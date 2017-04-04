/**
 *  Gcf.java
 * prints the greatest common factor
 * April 4, 2017
 * @author Alyssa Nodello
 */
package nodello;

import java.util.Scanner;

public class Gcf {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value");
		int a = sc.nextInt();
		System.out.println("Please enter a another value");
		int b = sc.nextInt();
		System.out.println("The greatest common factor is " +gcf(a,b));
		
	}
	/**
	 * sets the small number as the counter and divides the two values by the counter to see if they divide with no remainder
	 * @param a
	 * @param b
	 * @return the variable counter, the counter is the number being used in the modulus to see if there is no remainder
	 */
	public static int gcf(int a, int b) {
		int big = Math.max(a, b);
		int small = Math.min(a, b);
		int counter = small;
		while(big%counter != 0 || small%counter != 0){
			counter --;
		}
		return counter;
			}

}
