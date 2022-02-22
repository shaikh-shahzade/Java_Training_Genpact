package com.org.gen.day1;

import java.util.Scanner;

public class Q2PracticeLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Year");
		int year = sc.nextInt();

		if (year % 400 == 0) {
			System.out.println("Leap Year");
		} else {

			if (year % 4 == 0 && year % 100 != 0)
				System.out.println("Leap Year");
			else
				System.out.println("Not a Leap Year");
		}

	}

}
