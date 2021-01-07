package com.LI.Package;

import java.util.LinkedList;
import java.util.ListIterator;

public class LIC1 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList<>();
		//ListIterator li = null;
		ll.add("Raju");
		ll.add("Raj");
		ll.add("raghu");
		System.out.println(ll);
		ListIterator li = ll.listIterator();
		while(li.hasNext())
		{
			String  str = (String) li.next();
			 System.out.println(li.nextIndex());
			 if(str.equals("raghu"))
			 {
				 li.set("Raghu");
				 li.add("Added");
			 } 
			 
		}
		System.out.println(ll);
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		//System.out.println(ll);
	}
}
