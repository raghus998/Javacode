package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		System.out.println("Size os c1 Before :"+c1.size());
		c1.add("A");
		c1.add("b");
		c1.add("C");
		c1.add("D");
		c1.add("E");
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(null);
		c1.add(0);
		System.out.println(c1);
		System.out.println("Size os c1 after :"+c1.size());
		c2.addAll(c1);
		System.out.println(c2);
		System.out.println(c1.containsAll(c2));
	}

}
