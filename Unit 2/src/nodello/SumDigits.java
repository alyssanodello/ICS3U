/**
 * SumOfDigits.java
 * prints the sum of digits in a value
 * April 3, 2017
 * @author Alyssa Nodello
 */
package nodello;
import java.util.Scanner;
public class SumDigits {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter a value");
		int num = sc.nextInt();
		System.out.println("The sum of digits is " +sumOfDigits(num));
	}
	/**
	 * in a loop it adds each digit
	 * @param x
	 * @return total sum of the digits
	 */
	public static int sumOfDigits(int x){
		int total = 0;
		while(x>0){
			total = total + x%10;
			x = x/10;
		}
		return total;
	}

}
