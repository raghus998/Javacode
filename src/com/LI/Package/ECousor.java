package com.LI.Package;

import java.util.Enumeration;
import java.util.Vector;

public class ECousor {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		for (int i = 0; i < 11; i++) {
			v.addElement(i);
			
		}
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			int j = (int)e.nextElement();
			if(j%2==0)
			{
			System.out.print(j+" ");
			}
		System.out.println();
		}
		System.out.println(v);
	}

}
