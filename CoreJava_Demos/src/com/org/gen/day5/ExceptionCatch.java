package com.org.gen.day5;

public class ExceptionCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int x = 5 / 0;
		} catch (ArithmeticException e) {
			String s = null;

			s.length();
			System.out.println(" Outer Catch " + e);
		} finally {
			System.out.println("Finally ");
		}
		System.out.println("out of try ");
	}

}
