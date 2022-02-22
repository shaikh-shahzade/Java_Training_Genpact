package com.org.gen.day5;

@FunctionalInterface
interface A1 {
	public boolean checkSingleDigit(int x);
}

class Digit {
	public static boolean isSingleDigit(int x) {
		if (x >= 0 && x < 10)
			return true;
		return false;
	}
}

public class TestStaticMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 a1 = (x) -> {
			if (x >= 0 && x < 10)
				return true;
			return false;
		};
		System.out.println("Lambda " + a1.checkSingleDigit(5));

		A1 a2 = Digit::isSingleDigit;
		System.out.println("Reference " + a2.checkSingleDigit(55));

	}

}
