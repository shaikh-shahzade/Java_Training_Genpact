package com.org.gen.day3;

@FunctionalInterface
public interface Home {

	void HomeLoan();

	static void loanPrice() {
		System.out.println("Max Amount: 300000Rs");
	}

	default void m2() {
		System.out.println("Pay Loan At time");
	}
}
