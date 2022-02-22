package com.org.gen.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Developer> arrDev = new ArrayList<Developer>();

		arrDev.add(new Developer(1, "Ritik", 2.5, 100000));
		arrDev.add(new Developer(2, "Kartik", 2, 150000));
		arrDev.add(new Developer(3, "Anupam", 1, 350000));
		arrDev.add(new Developer(4, "Sweta", 4.5, 420000));
		arrDev.add(new Developer(5, "Arvind", 7, 980000));
		System.out.println("Before Sorting");
		Iterator<Developer> it = arrDev.iterator();
		Developer tempD;
		while (it.hasNext()) {
			tempD = it.next();
			System.out.println("ID: " + tempD.id + " Name: " + tempD.name);

		}

		System.out.println("After Sorting");

		Collections.sort(arrDev, new AlphabeticalComparator());

		it = arrDev.iterator();
		while (it.hasNext()) {
			tempD = it.next();
			System.out.println("ID: " + tempD.id + " Name: " + tempD.name);

		}

		System.out.println("Max Salary");
		Developer maxSalaryDeveloper = Collections.max(arrDev, new SalaryComparator());

		System.out.println("Max Salary Developer\n" + "name: " + maxSalaryDeveloper.name + " salary: "
				+ maxSalaryDeveloper.salary);

	}

}
