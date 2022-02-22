package com.org.gen.day3;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassX obj = new ClassY();

		obj.M1(25);

		ClassX obj2 = new ClassX();
		obj2.M1(55);

		ClassY obj3 = new ClassY();
		obj3.M1(100);

	}

}

class ClassX {
	static void M1(int A) {
		System.out.println("M1 -X");
	}
}

class ClassY extends ClassX {
	static void M1(int Y) {
		System.out.println("M1 -Y");
	}
}