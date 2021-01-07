package hackerrank;

import java.util.Scanner;

public class Toprintseriesofnum {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a A value");
		int a = sc.nextInt();
		System.out.println("Enter a B value");
		int b= sc.nextInt();
		System.out.println("Enter a n value");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a = a+b;
			System.out.println(a+" ");
			b = b * 2;
		}
	
		System.out.println("----------------------------------");
		/*for (int i = 0; i < n ; i++) {
			a = a + (int)Math.pow(2, i) * b;
			System.out.println(a+" ");
		}*/
		
	}

}
