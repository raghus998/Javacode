package com.LI.Package;

import java.util.ArrayList;
import java.util.Iterator;

public class Icousor {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		for (int i = 0; i <=10; i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			int j = (int) i.next();
			if(j%2==0)
			{
				System.out.print(j+" ");
			}
			else {
				i.remove();
			}
		}
		System.out.println(al);
	}

}
