package com.org.gen.day1;

import java.util.Scanner;

public class Selection_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Test Score:");
		String voterID = sc.nextLine();
		double score = Double.parseDouble(voterID);

		if (score > 60) {
			System.out.println("Good Job");
		} else if (score == 60) {
			System.out.println("Barely Passed");
		} else {
			System.out.println("Try Again");
		}

	}

}
