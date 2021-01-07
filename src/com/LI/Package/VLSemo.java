package com.LI.Package;

import java.util.Vector;

public class VLSemo {
	public static void main(String[] args) {
		Vector v = new Vector(3,30);
		v.add("A");
		v.addElement("B");
		v.add( "a");
		v.add("B");
		v.add("10");
		v.add("a");
		v.add(null);
		v.add(null);
		v.add("250");
		v.add(2,"bcubcbyuc");
		v.add("eycwevcusbc");
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		System.out.println(v.get(0));
		System.out.println(v.firstElement());
		System.out.println(v.capacity());
		//v.clear();
		System.out.println(v);
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
	}

}
