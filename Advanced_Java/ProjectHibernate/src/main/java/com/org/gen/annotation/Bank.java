package com.org.gen.annotation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank")
public class Bank {

	@Id
	private int account_number;
	private String  Name;
	private int  available_balance;
	private String  phone_number;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAvailable_balance() {
		return available_balance;
	}
	public void setAvailable_balance(int available_balance) {
		this.available_balance = available_balance;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account Number: "+this.account_number+" Name: "+this.Name +" balance: "+this.available_balance+" phone_number: "
				+this.phone_number;
	}
	
	
	
}
