package programs;

import java.util.Scanner;

public class FactorialOfNum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		int i,fact = 1;
		for (i = 1;  i<= num;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorail of "+num+" is :"+fact);
		

		
	}

}
