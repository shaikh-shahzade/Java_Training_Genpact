package com.org.gen.day1;

import java.util.Scanner;

public class Practice_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter VoterID:");
		int voterID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		String name = sc.nextLine();

		System.out.println("Enter Age:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter location:");
		String location = sc.nextLine();

		System.out.println("VoterID:" + voterID);
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("location:" + location);

	}

}
