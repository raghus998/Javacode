package programs;

import java.util.Scanner;

public class AmstrongNum 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = num,ON = 0,rem;
		while (num>0)
		{
			rem = num % 10;
			num = num / 10;
			ON = ON + (rem* rem* rem);
			
		}
		if (ON == temp)
		{
			System.out.println("Amstrong num");
			
		} else {
			System.out.println(" Not Amstrong num");
		}
	}

}
