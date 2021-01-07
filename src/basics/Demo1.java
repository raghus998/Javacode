package basics;

public class Demo1 {
	public static void main(String[] args) {
		byte i = 10;
		byte j = 20;
		int m = i + 1;
		int k =  (i + j);
		System.out.println(k);
		System.out.println(m);
		//System.out.println(10/0);
		//System.out.println(0/0);
		System.out.println(-10/0.0);
		System.out.println(0/0.0);
		int x = 10;
		System.out.println(x > Float.NaN);
		System.out.println(x != Float.NaN);
		System.out.println(Float.NaN != Float.NaN);	
	}
}
