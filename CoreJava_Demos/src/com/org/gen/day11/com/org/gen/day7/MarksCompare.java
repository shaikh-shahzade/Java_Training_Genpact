package com.org.gen.day7;

import java.util.Comparator;

public class MarksCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		Student s1 = o1;
		Student s2 = o2;
		if (s1.marks == s2.marks)
			return 0;
		else if (s1.marks > s2.marks)
			return 1;
		else
			return -1;
	}

}
