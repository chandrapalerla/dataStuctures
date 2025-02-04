package com.corejava;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator st1, StudentComparator st2) {
		StudentComparator s1 = (StudentComparator) st1;
		StudentComparator s2 = (StudentComparator) st2;

		if (s1.rollno == s2.rollno)
			return 0;
		else if (s1.rollno > s2.rollno)
			return 1;
		else
			return -1;
	}

}
