package com.org.gen.Assessment2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int  r = sc.nextInt();
		System.out.println(UserMainCodeCombination.calculateNcr(n, r));
	}

}
