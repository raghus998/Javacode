package com.set.Package;

import java.util.HashSet;

public class HDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet(5,50);
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");	
		hs.add("E");	
		hs.add("F");
		hs.add("H");	
		hs.add("Y");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		System.out.println("-----------------------");
		HashSet<String> hs1 = new HashSet<>(hs);
		System.out.println(hs1);
		
	}
	

}
