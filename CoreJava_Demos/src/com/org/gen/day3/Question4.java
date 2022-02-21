package com.org.gen.day3;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoAbstract abs = new MySubClass();
		abs.a_method();
		abs.normalM();

	}

}

abstract class DemoAbstract {
	public DemoAbstract() {
		System.out.println("This is Constructor of Abstract Class");
	}

	abstract void a_method();

	void normalM() {
		System.out.println("This is Normal Method of Abstract Class");
	}

}

class MySubClass extends DemoAbstract {

	@Override
	void a_method() {
		// TODO Auto-generated method stub
		System.out.println("This is Abstract Method");

	}

}