package com.org.gen.day2;

public class Member {

	String name;
	int age;
	long phoneNum;
	String address;
	int Salary;

	void printSalary() {
		System.out.println("Salary: " + Salary + "Rs");
	}
}

class Employee2 extends Member {
	String specialization;

}

class Manager extends Member {
	String department;
}