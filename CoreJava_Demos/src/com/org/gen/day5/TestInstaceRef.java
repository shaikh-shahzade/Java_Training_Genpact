package com.org.gen.day5;

public class TestInstaceRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		I3 a1 = (x) -> {
			if (x >= 0 && x < 10)
				return true;
			return false;
		};
		System.out.println("Lambda " + a1.checkSingleDigit(5));

		DigitI d = new DigitI();

		I3 a2 = d::isSingleDigit;
		System.out.println("Instance Reference " + a2.checkSingleDigit(55));
	}

}

@FunctionalInterface
interface I3 {
	public boolean checkSingleDigit(int x);
}

class DigitI {
	public boolean isSingleDigit(int x) {
		if (x >= 0 && x < 10)
			return true;
		return false;
	}
}