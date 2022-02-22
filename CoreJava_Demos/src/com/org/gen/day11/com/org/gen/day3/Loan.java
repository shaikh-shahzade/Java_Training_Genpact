package com.org.gen.day3;

public class Loan implements Home {

	@Override
	public void HomeLoan() {
		// TODO Auto-generated method stub
		System.out.println("Home Loan Approved");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loan hloan = new Loan();
		hloan.HomeLoan();
		hloan.m2();

		Home.loanPrice();

	}

}
