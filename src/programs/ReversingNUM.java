package programs;

import java.util.Scanner;

public class ReversingNUM {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		int rev = 0,rem;
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			rev = (rev*10)+rem;
		}
		System.out.println(rev);
	}

}
