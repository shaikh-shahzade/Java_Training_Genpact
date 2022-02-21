package com.org.gen.day3;

@FunctionalInterface
public interface AInterface {

	default void m1() {
		System.out.println("Default Method M1");
	}

	void m2();

	static void m3() {
		System.out.println("Static Method M3");
	}
}
