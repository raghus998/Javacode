package basics;

public class D
{

	static
	{
		System.out.println("Static block");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(C.i);
		C.method1();
		C c = new C();
		System.out.println(c.j);
		c.j = 30;
		System.out.println(c.j);
		c.method();
		C c1 = new C();
		System.out.println(c1.j);
	}
}
