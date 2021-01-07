package com.set.Package;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.*;
import java.lang.*;

public class TDemo1 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet<>( new myComparator2());
		t.add(100);
		t.add(110);
		t.add(120);
		t.add(99);
		t.add(180);
		t.add(258);
		t.add(125);
		t.add(95);
		t.add(10);
		t.add(11);
		System.out.println(t);
	}

}
/*class myComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		int	i1 = (int) o1;
		int i2 = (int) o2;
		if(i1<i2)
		{
			return +1;
		}
		else if(i1>i2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
	
}*/

class myComparator2 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		int i1 = (int) o1;
		int i2 = (int) o2;
		//return i1.compareTO(i2);
		return -1;
	}
	

	//return 0;
	//return +1;
	//return -1;
	
	
	
	
}
