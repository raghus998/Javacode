package com.map;

import java.util.Hashtable;

public class HT {
	public static void main(String[] args) {
		Hashtable h = new Hashtable<>(20);
		h.put(new Temp1(5),"A");
		h.put(new Temp1(2),"A");
		h.put(new Temp1(3),"A");
		h.put(new Temp1(6),"A");
		h.put(new Temp1(9),"A");
		h.put(new Temp1(10),"A");
		h.put(new Temp1(55),"A");
		h.put(new Temp1(89),"A");
		System.out.println(h);
		
	}

}
