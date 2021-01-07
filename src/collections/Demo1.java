package collections;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Program of ArrayList is Started");
		ArrayList list = new ArrayList();
		System.out.println("Before size:"+list.size());
		list.add("A");
		list.add("B");
		list.add("Raghu");
		list.add(5);
		list.add("Raju");
		list.add(7);
		list.add(7.22);
		list.add("A");
		list.add(null);
		list.add("B");
		list.add('C');
		System.out.println(list);
		System.out.println("After size:"+list.size());
		list.remove("A");
		System.out.println(list);
		System.out.println("After size:"+list.size());
		list.remove("A");
		System.out.println(list);
		System.out.println("After size:"+list.size());
		System.out.println("Program ended");
	}

}
