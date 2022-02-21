package com.org.gen.Assessment2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String pass = sc.next();
		int res = UserMainCode_ValidatePassword.validatePassword(pass);
		if (res == 1)
			System.out.println("valid");
		else
			System.out.println("Invalid");

	}

}
