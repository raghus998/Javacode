package com.set.Package;

import java.util.TreeSet;

public class TDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(100);
		t.add(110);
		t.add(120);
		t.add(99);
		t.add(180);
		t.add(258);
		t.add(125);
		t.add(95);
		t.add(10);
		t.add(11);
		//t.add(null);
		/*t.add(new  StringBuffer("A"));
		t.add(new  StringBuffer("B"));
		t.add(new  StringBuffer("D"));
		t.add(new  StringBuffer("C"));*/
		System.out.println(t);
		System.out.println("A".compareTo("B"));
		
}

}
