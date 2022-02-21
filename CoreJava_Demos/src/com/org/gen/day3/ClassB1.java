package com.org.gen.day3;

public class ClassB1 extends A {

	String s = "Hi";

	void display() {

		System.out.println(super.s);
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassB1 b1 = new ClassB1();
		b1.display();

	}

}

class A {
	String s = "Hello";
}
