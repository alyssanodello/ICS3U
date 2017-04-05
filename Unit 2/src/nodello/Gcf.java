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
		while(isDivisble (big, counter)== false || isDivisble(small, counter)== false){
			counter --;
		}
		return counter;
			}
	/**
	 * sees value a and value b to test if they perfectly divide with no remainder
	 * @param a
	 * @param b
	 * @return returns true or false if there is no remainders in the division
	 */
	private static boolean isDivisble(int a, int b) {
		if(a%b == 0){
		return true;	
		}
		return false;
	}
	

}
