package collections;

import java.awt.List;
import java.util.ArrayList;

public class AL {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		al.add(new Student(100,"Raghu",'M',70.22));
		al.add(new Student(100,"Raghu",'M',70.22));
		al.add(new Student(101,"Raja",'M',75.22));
		al.add(new Student(102,"Raju",'M',77.22));
		al.add(new Pen(10,"Blue","Cello",'G'));
		al.add(new Pen(10,"Blue","Cello",'G'));
		al.add(new Pen(10,"Blue","Raghu",'G'));
		al.add(new Pen(20,"RED","Fly",'G'));
		al.add(new Pen(30,"Black","Pin Point",'B'));
		al.add(new Employee(3232,"Raghu",'M',5000.33));
		al.add(new Employee(3232,"Raghu",'M',5000.33));
		al.add(new Employee(3233,"Raja",'M',5000.33));
		al.add(new Car("Swift","maruthi",900000.00,"White"));
		al.add(new Car("Swift","maruthi",900000.00,"White"));
		al.add(new Car("City","Honda",950000.00,"Black"));
		al.add(new Car("Swift Desire","maruthi",1000000.00,"White"));
		al.add(new Car("Swift","maruthi",900000.00,"White"));
		al.add(10, "Newly added object");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			System.out.println();
		}
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(3));
		al.remove(3);
		System.out.println(al.get(3));
		System.out.println(al.size());
		}
}
