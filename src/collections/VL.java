package collections;

import java.util.Vector;

public class VL {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(new Student(100,"Raghu",'M',70.22));
		v.add(new Student(100,"Raghu",'M',70.22));
		v.add(new Student(101,"Raja",'M',75.22));
		v.add(new Student(102,"Raju",'M',77.22));
		v.add(new Pen(10,"Blue","Cello",'G'));
		v.add(new Pen(10,"Blue","Cello",'G'));
		v.add(new Pen(10,"Blue","Raghu",'G'));
		v.add(new Pen(20,"RED","Fly",'G'));
		v.add(new Pen(30,"Black","Pin Point",'B'));
		v.add(new Employee(3232,"Raghu",'M',5000.33));
		v.add(new Employee(3232,"Raghu",'M',5000.33));
		v.add(new Employee(3233,"Raja",'M',5000.33));
		v.add(new Car("Swift","maruthi",900000.00,"White"));
		v.add(new Car("Swift","maruthi",900000.00,"White"));
		v.add(new Car("City","Honda",950000.00,"Black"));
		v.add(new Car("Swift Desire","maruthi",1000000.00,"White"));
		v.add(new Car("Swift","maruthi",900000.00,"White"));
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
			System.out.println();
	}

}
}
