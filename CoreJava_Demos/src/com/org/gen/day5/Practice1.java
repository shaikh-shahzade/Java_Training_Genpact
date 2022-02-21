package com.org.gen.day5;

@FunctionalInterface
interface i1 {
	void print();

	static void hello() {
		System.out.println("First Hello");
	}

	default void m1() {
		System.out.println("M1");
	}
}

public class Practice1 implements i1 {

	static void hello() {
		System.out.println("2nd Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice1 p = new Practice1();
		p.m1();
		p.hello();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

}
