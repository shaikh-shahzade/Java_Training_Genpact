package com.org.gen.day6.test;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SBI sbi = new SBI(10.433 , 7.42  ,5);
		 
		System.out.println("SBI interest rate is:"+sbi.getMinInterestRate());

		System.out.println("SBI Min Balance  is:"+sbi.getMinBalance());
		
		Customer customer = new Customer("Shahzde" , "Varansai" , 25);
		
		
		
		ICICI icici = new ICICI(8.433 , 8.62  ,7);
		 
		System.out.println("ICICI interest rate is:"+sbi.getMinInterestRate());

		System.out.println("ICICI Min Balance  is:"+sbi.getMinBalance());
		
		Customer customer2 = new Customer("Shubham" , "Raipur" , 25);
		
	}

}

class RBI
{
	private  double minInterestRate ;
	private  double minBalance ;
	private  double maxWithdrawal ;
	public double getMinInterestRate() {
		return minInterestRate;
	}
	public double getMinBalance() {
		return minBalance;
	}
	public double getMaxWithdrawal() {
		return maxWithdrawal;
	}
	public RBI(double minInterestRate, double minBalance, double maxWithdrawal) {
		super();
		this.minInterestRate = minInterestRate;
		this.minBalance = minBalance;
		this.maxWithdrawal = maxWithdrawal;
	}
	
}


class Customer{
    String name;
    String address;
    int age;
	public Customer(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
}

class Account{
    String accType;
    String branchType;
}


class SBI extends RBI{ 
    
	
	
    public SBI(double minInterestRate, double minBalance, double maxWithdrawal) {
		super(minInterestRate, minBalance, maxWithdrawal);
		// TODO Auto-generated constructor stub
	}
    
   
}

class ICICI extends RBI{
   
	public ICICI(double minInterestRate, double minBalance, double maxWithdrawal) {
		super(minInterestRate, minBalance, maxWithdrawal);
		// TODO Auto-generated constructor stub
	}
}
