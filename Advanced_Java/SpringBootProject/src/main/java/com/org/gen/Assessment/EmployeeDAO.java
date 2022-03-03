package com.org.gen.Assessment;

import org.springframework.stereotype.Repository;

import com.org.gen.Assessment.Employees;

@Repository
public class EmployeeDAO {

	private static Employees list = new Employees();

	static {

		list.getEmployeeList().add(new Employee(1, "Prem", "Tiwari", "chapradreams@gmail.com"));

		list.getEmployeeList().add(new Employee(2, "Vikash", "Kumar", "abc@gmail.com"));

		list.getEmployeeList().add(new Employee(3, "Ritesh", "Ojha", "asdjf@gmail.com"));

	}

	public Employees getAllEmployees() {

		return list;
	}

	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);

	}
}
