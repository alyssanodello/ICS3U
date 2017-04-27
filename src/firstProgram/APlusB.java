package firstProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusB {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int problems = Integer.parseInt(null);
		for(int i =0; i<=problems; i++){
			String[] value = in.readLine().split(" ");
			int a = Integer.parseInt(value[0]);
			int b = Integer.parseInt(value[1]);
			int sum = a + b;
			System.out.println(sum);
		}
	}

}
