package com.org.gen.day3;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 c1 = new Child1();
		c1.message();
		Child2 c2 = new Child2();
		c2.message();

	}

}

abstract class Parent {
	abstract void message();
}

class Child1 extends Parent {

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is First Sub Class");

	}

}

class Child2 extends Parent {

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is Second Sub Class");

	}

}