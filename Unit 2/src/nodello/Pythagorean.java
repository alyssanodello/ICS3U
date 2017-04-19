/**
 * to find all the perfect pythagorean triangles with sides from 0-99
 * Alyssa Nodello
 * April 19 2017
 */
package nodello;

public class Pythagorean {

	public static void main(String[] args) {
		for(int a = 1;a<100; a++){
			for(int b= 1; b<100; b++){
				int c = (int)(Math.pow(a,2) + Math.pow(b,2));
				
						
						if(perfectSquare(c)== true ){
							c= (int)Math.sqrt(c);
							System.out.println(a + "+" + b + "=" + c);
						}
			}
		}
		

	}
	/**
	 * checks to see if the c value is a whole number 
	 * @param n
	 * @return true or false if it is a perfect square
	 */
	public static boolean perfectSquare(int n){
		int x = (int)Math.sqrt(n);
		double check = Math.pow(x, 2);
		if(check == n){
			return true;
		}
		else{
			return false;
		}
		
	}

}
