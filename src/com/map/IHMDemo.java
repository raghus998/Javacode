package com.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IHMDemo {
	public static void main(String[] args) {
		//HashMap h = new HashMap<>();
		IdentityHashMap h = new IdentityHashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		h.put(i1,"Raghu");
		h.put(i2,"Raja");
		System.out.println(h);
	}

}
