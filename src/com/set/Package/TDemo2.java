package com.set.Package;

import java.util.Comparator;
import java.util.TreeSet;

public class TDemo2 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet<>(new myComparator1());
		t.add("Raghu");
		t.add("Ashu");
		t.add("Raja");
		t.add("Baby");
		t.add("Muktha");
		t.add("Arun");
		t.add("Akhil");
		System.out.println(t);
	}

}
class myComparator1 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return -s1.compareTo(s2);
	}
	
}
