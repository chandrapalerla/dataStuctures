package com.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparatorimpl {

	public static void main(String[] args) {
		ArrayList<StudentComparator> al = new ArrayList<StudentComparator>();
		al.add(new StudentComparator(101, "Vijay", 23));
		al.add(new StudentComparator(106, "Ajay", 27));
		al.add(new StudentComparator(105, "Jai", 21));

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		Iterator<StudentComparator> itr2 = al.iterator();
		while (itr2.hasNext()) {
			StudentComparator st = (StudentComparator) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
