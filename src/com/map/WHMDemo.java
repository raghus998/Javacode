package com.map;

import java.util.WeakHashMap;

public class WHMDemo {
	public static void main(String[] args) throws InterruptedException {
		WeakHashMap w = new WeakHashMap<>();
		Temp t = new Temp();
		w.put(t,"0000ABCDEFGHIJK");
		System.out.println(w);
		t= null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(w);
	}
}
class Temp
{
	public String toString()
	{
		return "Temp";
	}
	public void finalize()
	{
		System.out.println("finalize() is called");
	}
}
