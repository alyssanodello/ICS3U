/**
 * LargestNumber.java
 * returns the largest value entered
 * April 3, 2017
 * @author Alyssa Nodello
 */
package nodello;
import java.util.Scanner;

public class LargestNumber {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many numbers do you want to compare?");
		int listLength = sc.nextInt();
		System.out.println("Please enter one number per line with no decimals");
		
		int[] numbers = new int[listLength];
		for(int a= 0;a<listLength; a++){
			numbers [a]= sc.nextInt();
		}
		
		int biggestNumberInArray = largestNum(numbers);
		System.out.println("The grestest number you enetered was "+ biggestNumberInArray);

	}
	/**
	 * tests each number to see if its great than the previous number, if yes it becomes the newest large number
	 * @param array
	 * @return the largest number in the set given
	 */
	public static int largestNum(int [] array){
		int largestNumber = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] > largestNumber){
				largestNumber = array[i];
			}
		}
		return largestNumber;
	}
	

}
