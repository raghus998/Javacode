package collections;

import java.util.HashSet;

public class HS {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Raghu");
		hs.add(123);
		hs.add("Raghu");
		hs.add(null);
		hs.add(10);
		hs.add("Raghu");
		hs.add(123);
		hs.add("Raghu");
		hs.add(null);
		hs.add(10);
		hs.add(new Student(100,"Raghu",'M',70.22));
		hs.add(new Student(100,"Raja",'M',75.22));
		hs.add(new Student(102,"Raju",'M',77.22));
		hs.add(new Pen(10,"Blue","Cello",'G'));
		hs.add(new Pen(30,"Black","Pin Point",'B'));
		hs.add(new Employee(3232,"Raghu",'M',5000.33));
		hs.add(new Employee(3233,"Raja",'M',5000.33));
		hs.add(new Car("Swift","maruthi",900000.00,"White"));
		hs.add("It prints objects in random manner");
		hs.add("Insertion order is not preserved");

		
		System.out.println(hs);
		
		
			
		
	}
	
}
