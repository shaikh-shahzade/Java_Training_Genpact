package com.org.gen.day1;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println(" Selected 1");
			break;

		case 2:
			System.out.println(" Selected 2 ");
			break;

		case 3:
			System.out.println(" Selected 3 ");
			break;

		case 4:
			System.out.println(" Selected 4");
			break;

		default:
			System.out.println(" Default Called");
		}
	}

}
