package com.java.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	 public static void main(String []args)
	 {
		 LinkedList l = new LinkedList();
		 l.add("Raju");
		 l.add("Hari");
		 l.add("Ravi");
		 l.add("VAsu");
		 l.add(3,"ramu");
		 l.addFirst("Puja");
		 l.addLast(null);
		 l.addLast(20);
		 System.out.println(l);
	 }

}
