package com.set.Package;

import java.util.Comparator;
import java.util.TreeSet;

public class ETDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("Raghu",100);
		Employee e2 = new Employee("Ashu",99);
		Employee e3 = new Employee("Raj",110);
		Employee e4 = new Employee("Ranga",10);
		Employee e5 = new Employee("Rag",120);
		Employee e6 = new Employee("Muktha",120);
		TreeSet t =new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);
		System.out.println("==========================");
		Employee e11 = new Employee("Raghu",100);
		Employee e21 = new Employee("Ashu",99);
		Employee e31 = new Employee("Raj",110);
		Employee e41 = new Employee("Ranga",10);
		Employee e51 = new Employee("Rag",120);
		Employee e61 = new Employee("Muktha",120);
		TreeSet t1 = new TreeSet(new myStringComp());
		t1.add(e11);
		t1.add(e61);
		t1.add(e51);
		t1.add(e41);
		t1.add(e31);
		t1.add(e21);
		t1.add(e11);
		System.out.println(t1);	
	}

}
class myStringComp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		 Employee e1 = (Employee) o1;
		 Employee e2 = (Employee) o2;
		 String S1 = e1.name;
		 String S2 = e2.name;
		return S2.compareTo(S1);
	}
	
}
