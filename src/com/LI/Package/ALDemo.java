package com.LI.Package;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ALDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add(0, "a");
		al.add("B");
		al.add(0,"10");
		al.add(0, "a");
		al.add(null);
		al.add(null);
		al.add("250");
		al.add(320);
		System.out.println(al);
		System.out.println(al.getClass());
		System.out.println(al.get(0));
		System.out.println(al.contains("10"));
		System.out.println(al.isEmpty());
		System.out.println("--------------------------------------");
		Object[] array = al.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(al.indexOf("A"));
		al.remove("10");
		System.out.println(al);
		al.remove(5);
		System.out.println(al);
		//al.removeAll(al);
		System.out.println(al);
		List l = Collections.synchronizedList(al);
		System.out.println(l);
		System.out.println(al.get(5));
	
		
		
		}

}
