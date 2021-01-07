package hackerrank;

import java.util.Scanner;

public class StaticBlock {
	static int B,H;
	static boolean temp;
	static
	{
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		if(B>0 && H>0)
			//if(B>=0 && H>=0)
		{
			temp = true;
		}
		else if ((B >= 0 && H <= 0) || (B <= 0 && H >= 0) ||(B <= 0 && H <= 0))
		{
			temp = false;
			 System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	public static void main(String[] args) {
		if(temp)
		{
			int area = B*H;
			System.out.println(area);
		}
	}
}
