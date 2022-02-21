package com.org.gen.day7;

import java.util.Comparator;

public class AgeCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		Student s1 = o1;
		Student s2 = o2;
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}

}
