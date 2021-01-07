package com.map;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQDemo1 {
	public static void main(String[] args) {
		PriorityQueue p =new PriorityQueue(15,new PQComp());
		p.offer("K");
		p.offer("A");
		p.offer("z");
		p.offer("B");
		p.offer("r");
		p.offer("Z");
		p.offer("A");
		p.offer("b");
		//p.offer(10);
		System.out.println(p);
		
	}

}

class PQComp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String S1 = (String) o1;
		String S2 = (String) o2;
		return S2.compareTo(S1);
	}
	
}