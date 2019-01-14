package com.java.collections;

import java.util.Vector;

public class VectorDemo {
	public static void main(String []args)
	 {
		
		Vector v =new Vector();
		v.add(20);
		v.add("Raju");
		v.add(null);
		v.add('C');
		v.add('Z');
		v.add('C');
		/*for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}*/
		
		System.out.println(v);
	 }

}
