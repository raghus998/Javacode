package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HMDemo {
	public static void main(String[] args) {
		HashMap h  = new HashMap<>();
		h.put(100,"Raghu");
		h.put(101,"Muktha");
		h.put(105,"Arun");
		h.put(99,"Akhil");
		h.put(120,"Rashmi");
		h.put(100,"Raghavendra");
		//h.put(null, "52");
		
		System.out.println(h);
		Set s = h.keySet();
		System.out.println(s);
		Collection v = h.values();
		System.out.println(v);
		Set s1 = h.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		
		while(itr.hasNext())
		{
		Entry e1 = (Entry) itr.next();
		System.out.println(e1.getKey()+"_____________"+e1.getValue());
		if(e1.getKey().equals(99))
		{
			e1.setValue("RaghuS");
		}
		}
		System.out.println(h);	
	}

}
