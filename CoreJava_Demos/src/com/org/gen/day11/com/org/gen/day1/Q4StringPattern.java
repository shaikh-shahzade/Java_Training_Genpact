package com.org.gen.day1;

public class Q4StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		horizontal();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print("*");
			System.out.print("\n");
		}

		horizontal();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 7; j++)
				System.out.print(" ");
			for (int j = 0; j < 3; j++)
				System.out.print("*");
			System.out.print("\n");
		}
		horizontal();

	}

	private static void horizontal() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}
