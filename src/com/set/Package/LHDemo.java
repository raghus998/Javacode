package com.set.Package;

import java.nio.charset.MalformedInputException;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LHDemo {
	public static void main(String[] args) {
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add("D");
		 lh.add("E");	
		 lh.add("E");	
		 lh.add("F");
		 lh.add("H");	
		 lh.add("Y");
		 lh.add(null);
		 lh.add(null);
		 System.out.println(lh);
		 HashSet hs = new  HashSet<>(lh);
		 System.out.println(hs);
	}

}
