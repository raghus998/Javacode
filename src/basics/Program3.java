package basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program3 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("d");
		String day =sdf.format(date);
		System.out.println(day);
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM");
		String month =sdf1.format(date);
		System.out.println(month);
	}

}
