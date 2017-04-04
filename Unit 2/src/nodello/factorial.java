/**
 * Factorial.java
 * prints the product of all the values below it
 * April 3, 2017
 * @author Alyssa Nodello
 */
package nodello;

import java.util.Scanner;

public class factorial {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter a value");
		int num = sc.nextInt();
		System.out.println("The factorial is " +factorial(num));
	}
	/**
	 * Takes an input value x and multiplies it by every value below it
	 * @param x
	 * @return the factorial value with the variable name "product"
	 */
	public static int factorial(int x){
		if (x<0){
			return -1;
		}
		else if(x==0){
			return 1;
		}
		else{
			int product = 1;
			for (int i = x; i> 1; i--){
				product = product*i;
			}
			return product;
		}
	}

}
