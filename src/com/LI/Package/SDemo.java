package com.LI.Package;

import java.util.Stack;

public class SDemo {
	public static void main(String[] args) {
		Stack s = new Stack<>();
		s.add("A");
		s.add(0,"A");
		s.push("B");
		s.push("10");
		System.out.println(s);
		System.out.println(s.peek());
		//System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.search("10"));
	}

}
