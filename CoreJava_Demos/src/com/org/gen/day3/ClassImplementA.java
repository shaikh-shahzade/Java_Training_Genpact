package com.org.gen.day3;

public class ClassImplementA implements AInterface, CInterface {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method M2");
	}

	static void m3() {
		System.out.println("Over Ride static m3 in implemented Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassImplementA a = new ClassImplementA();
		a.m1();
		a.m2();

		AInterface.m3();

		a.m3();

	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub

	}

}
