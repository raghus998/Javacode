package hackerrank;

import java.util.Scanner;

public class Multiplies {
	public static final  Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter an Interger");
		int N = sc.nextInt();
		for (int i = 1; i <=10; i++) 
		{
			int R = N * i;
			System.out.printf("%d * %d = %d",N,i,R);
			System.out.println();
		}
		
	}

}
