package hackerrank;

import java.util.Scanner;

public class TpprintString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("============================================");
		for (int i = 0; i < 3; i++) {
			System.out.println("Enetr a String");
			String s1 = sc.next();
			System.out.println("Enter a int");
			int i1 = sc.nextInt();
			//System.out.printf("%-15s%03d",s1,i1);
			System.out.printf("%-20s %s\n", s1, i1);
			System.out.println();
			
		}
		System.out.println("============================================");
		
	}

}
