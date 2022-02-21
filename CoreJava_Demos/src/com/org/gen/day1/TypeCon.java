package com.org.gen.day1;

public class TypeCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nInt = 10;
		System.out.println("integer: " + nInt);

		double nDouble = nInt;
		System.out.println("double: " + nDouble);

		int x = (int) nDouble;

		String s = String.valueOf(nInt);
		System.out.println("Int into string: " + s);

		int y = Integer.parseInt(s);
		System.out.println("String to Int: " + y);

	}

}
