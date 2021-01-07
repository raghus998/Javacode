package com.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NMDemo {
	public static void main(String[] args) {
		NavigableMap n  = new TreeMap();
		n.put("A",10);
		n.put("B",20);
		n.put("D",30);
		n.put("F",40);
		n.put("G",50);
		n.put("D",60);
		n.put("H",70);
		n.put("I",80);
		n.put("J",90);
		System.out.println(n);
		System.out.println(n.ceilingKey("C"));
		System.out.println(n.higherKey("C"));
		System.out.println(n.floorKey("C"));
		System.out.println(n.lowerKey("C"));
		System.out.println(n.lowerEntry("C"));
		System.out.println(n.pollFirstEntry());
		System.out.println(n.pollLastEntry());
		System.out.println(n.descendingMap());
		
		
	}

}
