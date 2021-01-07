package hackerrank;

import java.util.Scanner;

public class Datatype1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try
		{
		System.out.println("Enter a No to be checked");
		long n = sc.nextLong();
		System.out.println(n+"can be fitted in:");
		if(n>= -128 && n<= 127)System.out.println("* byte");
		if(n>= -Math.pow(2, 15) && n<= Math.pow(2, 15)-1)System.out.println("* short");
		if(n>= -Math.pow(2, 31) && n<= Math.pow(2, 31)-1)System.out.println("* int");
		if(n>= -Math.pow(2, 63) && n<= Math.pow(2, 63)-1)System.out.println("* long");
	}
		catch (Exception e) {
			System.out.println(sc.nextLine()+"can't be fitted anywhere");
		}
	}
}
