package com.org.gen.day6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(new NewEmployee("Sachin", 1, 10000, 4, "Developer"));
		employeeSet.add(new OldEmployee("Alan", 2, 56000, 2, "Designer"));
		employeeSet.add(new NewEmployee("virat", 3, 245000, 5, "Tester"));
		employeeSet.add(new OldEmployee("Adam", 4, 670000, 9, "Manager"));
		employeeSet.add(new OldEmployee("Lufi", 5, 985000, 7, "java"));
		employeeSet.add(new NewEmployee("Alex", 6, 885000, 5, "Designer"));
		employeeSet.add(new NewEmployee("Kiara", 7, 2350000, 1, "Manager"));
		employeeSet.add(new OldEmployee("Anurag", 8, 1000000, 8, "java"));

		System.out.println("Total Employees: " + employeeSet.size());

		employeeSet.removeIf(a -> a.experience < 4);
		System.out.println("Total Employees after Removing: " + employeeSet.size());
		int Count = 0;

		for (Employee e : employeeSet)
			if (e.skillSet == "java")
				Count++;
		System.out.println("Total Employees with Java skills: " + Count);

	}

}
