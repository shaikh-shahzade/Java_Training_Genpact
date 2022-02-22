package com.org.gen.day3;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marks student1 = new StudentA(95, 45, 85);
		System.out.println("StudentA: " + student1.getPercentage() + "%");

		Marks student2 = new StudentB(78, 67, 89, 96);
		System.out.print("StudentA: " + student2.getPercentage() + "%");
	}

}

abstract class Marks {
	abstract double getPercentage();
}

class StudentA extends Marks {
	private double percentage;

	StudentA(double sub1, double sub2, double sub3) {
		percentage = (sub1 + sub2 + sub3) / 300 * 100;
	}

	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		return percentage;
	}

}

class StudentB extends Marks {
	private double percentage;

	StudentB(double sub1, double sub2, double sub3, double sub4) {
		percentage = (sub1 + sub2 + sub3 + sub4) / 400 * 100;
	}

	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		return percentage;
	}

}