package collections;

import java.util.LinkedHashSet;

public class LHS
{
	public static void main(String[] args) {
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("Raghu");
		lh.add(123);
		lh.add("Raghu");
		lh.add(null);
		lh.add(10);
		lh.add("Raghu");
		lh.add(123);
		lh.add("Raghu");
		lh.add(null);
		lh.add(10);
		lh.add(new Student(100,"Raghu",'M',70.22));
		lh.add(new Student(100,"Raja",'M',75.22));
		lh.add(new Student(102,"Raju",'M',77.22));
		lh.add(new Pen(10,"Blue","Cello",'G'));
		lh.add(new Pen(30,"Black","Pin Point",'B'));
		lh.add(new Employee(3232,"Raghu",'M',5000.33));
		lh.add(new Employee(3233,"Raja",'M',5000.33));
		lh.add(new Car("Swift","maruthi",900000.00,"White"));
		lh.add("It will not print objects in random manner");
		
		lh.add("Insertion order is preserved");
		System.out.println(lh);
		
		lh.add("sfgdghfdgfd");
		System.out.println(lh);
	}
}
