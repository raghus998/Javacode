package programs;

public class PrimeNum 
{
public static void main(String[] args)
{
	int m= 0,flag = 0;
	int n = 41;
	m = n/2;
	if(n==0||n==1)
	{
		System.out.println("NP");
	}
	else
	{
		for (int i = 2; i<=m; i++) 
		{
			if(n%2==0)

			{
				System.err.println("NP");
				flag = 1;
				break;
			}
		}
	}
	
}
if(flag=0)

{
	System.out.println("p");
}

}
