package com.LI.Package;

import java.util.LinkedList;

public class LLDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("A");
		ll.add( "a");
		ll.add("B");
		ll.add("10");
		ll.add("a");
		ll.add(null);
		ll.add(null);
		ll.add("250");
		ll.add(320);
		System.out.println(ll);
		ll.addFirst("add1");
		ll.addLast("addL");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeLast();
		ll.removeFirst();
		ll.add(5,"5th index");
		System.out.println(ll);
		ll.remove(5);
		System.out.println(ll);
		ll.set(5,"5th element");
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll);
	}
}
