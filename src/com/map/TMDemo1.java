package com.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TMDemo1 {
	public static void main(String[] args) {
		TreeMap t = new TreeMap(new treeComp());
		t.put("Abhi",100);
		t.put("Rja",120);
		t.put("Zavi",89);
		System.out.println(t);
	}
}
class treeComp implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		String S1 = (String) o1;
		String S2 = (String) o2;
		return S2.compareTo(S1);	
	}
}
	
