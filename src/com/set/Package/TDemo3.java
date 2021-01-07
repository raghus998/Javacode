package com.set.Package;

import java.util.Comparator;
import java.util.TreeSet;

public class TDemo3 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new bufferComparator());
		t.add(new StringBuffer("Raghu"));
		t.add(new StringBuffer("Ashu"));
		t.add(new StringBuffer("Arun"));
		t.add(new StringBuffer("SA"));
		t.add(new StringBuffer("Akhil"));
		System.out.println(t);
	}

}
class bufferComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		//return s1.compareTo(s2);
		return +1;
	}
	
}
