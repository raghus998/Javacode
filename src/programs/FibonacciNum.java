package programs;

import java.util.Scanner;

public class FibonacciNum 
{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter num");
		int count = sc.nextInt();
		int n1 = 0,n2 = 1;
		if (count == 0) {
			System.out.println(n1);
		}
		else if(count == 1)
		{
			System.out.println(n1+" "+n2);
		}
		else
		{
			System.out.print(n1+" "+n2);
			for (int i = 3; i <=count; i++)
			{
				int n3 = n1+n2;
				System.out.print(" "+n3);
				n1= n2;
				n2= n3;
				
			}
		}
	}

}
