package com.org.gen.day7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CompareInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> arrL = new ArrayList<Student>();
		arrL.add(new Student(1, "shah", 98, 25));
		arrL.add(new Student(2, "John", 67, 24));
		arrL.add(new Student(3, "Student3", 89, 28));
		arrL.add(new Student(4, "Student4", 56, 24));
		arrL.add(new Student(5, "Student5", 54, 23));

		System.out.println("Marks Compare :");
		Collections.sort(arrL, new MarksCompare());
		for (Student s : arrL)
			System.out.println(s.marks);

		System.out.println("Age Compare :");
		Collections.sort(arrL, new AgeCompare());
		for (Student s : arrL)
			System.out.println(s.age);
	}

}
