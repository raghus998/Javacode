package basics;

public class Program1 {
	public static void main(String[] args) {
		System.out.println("Program started");
		m1();
		System.out.println("program ended");
	}
		
		public  static void m1()
		{
			m2();
			System.out.println("Running m1()");
		}
		public static  void m2()
		{
			System.out.println("Running m2()");
		}

}
