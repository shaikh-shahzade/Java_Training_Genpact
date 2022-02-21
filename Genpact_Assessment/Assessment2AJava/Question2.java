package com.org.gen.Assessment2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        String s1 = sc.next();
	        int b = UserMainColorCode.validateColorCode(s1);
	        if (b==1)
	            System.out.println("Valid");
	        else
	            System.out.println("Invalid");
	}

}
