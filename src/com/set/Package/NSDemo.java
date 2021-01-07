package com.set.Package;

import java.util.NavigableSet;
import java.util.TreeSet;

import javax.swing.text.NavigationFilter;

public class NSDemo {
	public static void main(String[] args) {
		NavigableSet n = new TreeSet<>();
		n.add(1000);
		n.add(3000);
		n.add(5000);
		n.add(3000);
		n.add(2000);
		n.add(4000);
		n.add(7000);
		n.add(6000);
		System.out.println(n);
		System.out.println(n.ceiling(3500));
		System.out.println(n.higher(4500));
		System.out.println(n.floor(3500));
		System.out.println(n.lower(4500));
		System.out.println(n.pollFirst());
		System.out.println(n.pollLast());
		System.out.println(n.descendingSet());
	}

}
