package programs;

import java.util.Scanner;

public class ToFindFristAndSeconfLargestNumInArray {

	public static void main(String[] args)
	{
		int[] num = {4,9,8,0,6,24,10,5};
		int temp;
		for (int i = 0; i < num.length; i++)
		{
			for (int j = i+1; j < num.length; j++)
			{
				if(num[i]<num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j]= temp;
				}
				
			}
			
		}
		
		System.out.println("FL is :"+num[0]);
		System.out.println("SL is :"+num[1]);
	}

}
