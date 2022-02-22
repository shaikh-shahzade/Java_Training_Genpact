package com.org.gen.day5;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Inner Try");
			try {

			} catch (Exception e) {

			}
		} catch (ArithmeticException e) {
			System.out.println(" Outer Catch " + e);
		}

	}

}
