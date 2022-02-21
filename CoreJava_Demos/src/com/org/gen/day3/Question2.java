package com.org.gen.day3;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank a = new BankA(100);
		System.out.println("Bank A : " + a.getBalance() + "$");

		Bank b = new BankB(150);
		System.out.println("Bank B : " + b.getBalance() + "$");
		Bank c = new BankC(200);
		System.out.println("Bank C : " + c.getBalance() + "$");

	}

}

abstract class Bank {
	abstract int getBalance();

}

class BankA extends Bank {
	private int balance;

	BankA(int balance) {
		this.balance = balance;
	}

	@Override
	int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

}

class BankB extends Bank {
	private int balance;

	BankB(int balance) {
		this.balance = balance;
	}

	@Override
	int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

}

class BankC extends Bank {
	private int balance;

	BankC(int balance) {
		this.balance = balance;
	}

	@Override
	int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

}