package com.map;

import java.util.PriorityQueue;

public class PQSemo {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue<>();
		System.out.println(p.poll());
		for (int i = 0; i <= 10; i++) {
			p.offer(i);
		}
		System.out.println(p);
		p.poll();
		System.out.println(p);
	}

}
