package com.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);

		System.out.println(s);

		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
			if (i == 10) {
				itr.remove();
			}
		}
		
		ArrayList<String> aList = new ArrayList<String>();
	      aList.add("Apple");
	      aList.add("Mango");
	      aList.add("Guava");
	      aList.add("Orange");
	      aList.add("Peach");
	      System.out.println("The ArrayList elements are: ");
	      for (String s1: aList) {
	         System.out.println(s1);
	      }
	      Iterator i = aList.iterator();
	      String str = "";
	      while (i.hasNext()) {
	         str = (String) i.next();
	         if (str.equals("Orange")) {
	            i.remove();
	            System.out.println("\nThe element Orange is removed");
	         }
	      }
	      System.out.println("\nThe ArrayList elements are: ");
	      for (String s3: aList) {
	         System.out.println(s3); 
	      }

	}

}
