package com.org.gen.day1;

import java.util.Scanner;

public class Q6ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "ABC123";
		boolean isCorrect = false;
		Scanner sc = new Scanner(System.in);

		String temp;

		do {
			System.out.println("Please Enter password");
			temp = sc.nextLine();
			if (temp.equals(password)) {
				isCorrect = true;
				System.out.println("Great! Correct password , ");

			} else {
				System.out.println("OOPs! Wrong Password, Try Again");

			}

		} while (!isCorrect);

	}

}
