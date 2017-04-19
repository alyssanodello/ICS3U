/**
 * Palindrome
 * Alyssa Nodello
 * April 13 2017
 * checks to see if a word is a palindrome, which means that the first and last letter are the same, the second and second last letter are the same etc.
 */
package nodello;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to see if it is a palindrome");
		String word = sc.nextLine();
		if(isPalindrome(word)== true){
			System.out.println("That word is a palindrome");
		}
		else{
			System.out.println("That word is not a palindrome");
		}

	}
	/**
	 * using a loop the counter value is the char at value. there is a forward and backward counter to check the first vs last letter. One is for words with an even amount of letters and one is for an odd number
	 * @param word
	 * @return a true or false value whether or not the word is a palindrome
	 */
	public static boolean isPalindrome(String word){
		boolean palindrome = false;
		if(word.length()%2 == 1){
			for(int a= 0; a<word.length()/2; a++){
				for (int b = word.length()-1; b> word.length()/2; b--){
					if( word.charAt(a)== word.charAt(b)){
						palindrome = true;
					}
					else{
						palindrome = false;
					}
				}
			}
		}
		else {
			for(int a= 0; a<word.length()-1; a++){
				for (int b = word.length()-1; b> 0; b--){
					if( word.charAt(a)== word.charAt(b)){
						palindrome = true;
					}
					else{
						palindrome = false;
					}
				}
			}
		}
	return palindrome;

}
}

