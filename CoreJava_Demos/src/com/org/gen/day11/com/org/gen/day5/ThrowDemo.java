package com.org.gen.day5;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new ArithmeticException("Arithmetic Exception");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Catch: " + e + "  " + e.getMessage());

		}

	}

}
