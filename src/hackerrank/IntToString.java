package hackerrank;

import java.util.Scanner;

public class IntToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//String s = Integer.toString(n);
		String s = String.valueOf(n);
		//String s = ""+n;
		System.out.println(s);
		
	}

}
