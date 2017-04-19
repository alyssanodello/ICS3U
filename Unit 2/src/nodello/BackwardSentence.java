/**
 * BackwardsSentence
 * Prints a sentence but prints the letters in each word backwards
 * Alyssa Nodello
 * April 19 2017
 */
package nodello;

import java.util.Scanner;

public class BackwardSentence {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter a sentence");
	String[] myString = sc.nextLine().split(" ");
	for(int i = 0; i < myString.length; i ++){
		for(int a = myString[i].length()-1; a>=0; a--){
			if(a== myString[i].length()-1 &&i==0){
				System.out.print(Character.toUpperCase(myString[i].charAt(a)));
			}
			
			else{
				System.out.print(Character.toLowerCase(myString[i].charAt(a)));
			}
		}
		System.out.print(" ");
	}
		

	}

}
