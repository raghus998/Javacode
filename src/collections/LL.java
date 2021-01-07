package collections;

import java.util.LinkedList;

public class LL {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(new Student(100,"Raghu",'M',70.22));
		ll.add(new Student(100,"Raghu",'M',70.22));
		ll.add(new Student(101,"Raja",'M',75.22));
		ll.add(new Student(102,"Raju",'M',77.22));
		ll.add(new Pen(10,"Blue","Cello",'G'));
		ll.add(new Pen(10,"Blue","Cello",'G'));
		ll.add(new Pen(10,"Blue","Raghu",'G'));
		ll.add(new Pen(20,"RED","Fly",'G'));
		ll.add(new Pen(30,"Black","Pin Point",'B'));
		ll.add(new Employee(3232,"Raghu",'M',5000.33));
		ll.add(new Employee(3232,"Raghu",'M',5000.33));
		ll.add(new Employee(3233,"Raja",'M',5000.33));
		ll.add(new Car("Swift","maruthi",900000.00,"White"));
		ll.add(new Car("Swift","maruthi",900000.00,"White"));
		ll.add(new Car("City","Honda",950000.00,"Black"));
		ll.add(new Car("Swift Desire last but one","maruthi",1000000.00,"White"));
		ll.add(new Car("Swift","maruthi",900000.00,"White"));
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
			System.out.println();
		}
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.get(0));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll.size());
		System.out.println(ll.removeLast());
		System.out.println(ll.size());
		ll.addFirst(new Car("SwiftSwift","maruthi",900000.00,"White"));
		System.out.println(ll.size());// size will starts from 1 and index is from  0
		System.out.println(ll.get(0));
		System.out.println(ll.get(15));
		ll.add(3, "Added at 3");
		System.out.println(ll.get(3));
	}

}
