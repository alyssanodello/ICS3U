/**
 * IsPrime.java
 * sees if a number is a prime number or not and returns and prints if its prime or not
 * April 4, 2017
 * @author Alyssa Nodello
 */
package nodello;


import java.util.Scanner;

public class IsPrime {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Please enter a value to find out if it is a prime number");
		double a = sc.nextInt();

		if (isPrime(a)){
			System.out.println("That value is a prime number");
		}else if(!isPrime(a)){
			System.out.println("That value is not a prime number");
		}

	}
	/**
	 * square roots the number and sees if the entered value is divisible by the square root or numbers below
	 * @param a
	 * @return true or false depending on if the number is prime or not
	 */
	public static boolean isPrime (double a){

		if(a<=0){
			return false;
		}
		else {
			for (int counter =(int)Math.sqrt(a) ;counter > 1; counter--){
				if (isDivisible(a,counter)){
					return false;
				}

			}
			return true;
		}

	}
	private static boolean isDivisible(double a, int b) {
		if(a%b == 0){
			return true;
		}

		return false;
	}

}
