package collections;

import java.util.Collection;
import java.util.Vector;

public class Demo4 {
	public static void main(String[] args) {
		Collection c  = new Vector();
		System.out.println("Size of the c before :"+c.size());
		c.add("A");
		c.add(0);
		c.add("B");
		c.add(1);
		c.add('c');
		c.add(null);
		c.add(2);
		c.add(2);
		c.add("5656565");
		c.add(565665);
		c.add(0);
		c.add("A");
		c.add("A");
		System.out.println("Size of the c after :"+c.size());
		System.out.println(c);
		
		
		
	}

}
