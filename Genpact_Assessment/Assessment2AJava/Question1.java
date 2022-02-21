package com.org.gen.Assessment2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	    String prev = sc.nextLine();
	    String curr = sc.nextLine();
	    int perU = sc.nextInt();
	    int n1 = UserMainCodeElectricityBill.calculateElectricityBill(prev, curr, perU);
	    System.out.println("Electricity Bill: "+ n1);
	}

}
