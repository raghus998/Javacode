package com.set.Package;

import java.util.Comparator;
import java.util.TreeSet;

public class TDemo4 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet<>(new hertogenous());
		t.add("Raghu");
		t.add("Ashu");
		t.add("Raja");
		t.add("Baby");
		t.add("BaBy");
		t.add("Muktha");
		t.add("Arun");
		t.add(new StringBuffer("Gani"));
		t.add(new StringBuffer("Koppal"));
		t.add(new StringBuffer("Banlore"));
		t.add(new StringBuffer("Kar"));
		t.add(new StringBuffer("Akhil"));
		t.add(1111111111);
		System.out.println(t);
	}

}
class hertogenous implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int i1 = s1.length();
		int i2 = s2.length();
		if(i1<i2)
		{
			return -1;
		}
		else if(i1>i2)
		{
			return +1;
		}
		else
		{
			return s1.compareTo(s2);
		}
		
	}
	
}
