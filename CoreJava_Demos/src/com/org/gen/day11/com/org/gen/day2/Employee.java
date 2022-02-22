package com.org.gen.day2;

public class Employee {

	void print1() {
		System.out.println("This is  Parent Class");
	}
}

class Developers extends Employee {
	void print2() {
		System.out.println("This is  Child Class");
	}
}