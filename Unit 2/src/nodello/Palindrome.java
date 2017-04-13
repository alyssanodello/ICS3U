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
	public static boolean isPalindrome(String word){
		boolean palindrome = false;
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
		return palindrome;
		
		
		
	}

}
