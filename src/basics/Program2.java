package basics;

import java.util.Date;

public class Program2 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		String d= date.toString();
		String[] str = d.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			
		}
		
	}

}
