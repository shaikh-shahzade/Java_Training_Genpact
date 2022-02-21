package com.org.gen.day2;

public class PracticeConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product(1, "Phone", 10000);
		Product p2 = new Product(2, "Laptop", 22000);
		Product p3 = new Product(3, "Charger", 30000);
		Product p4 = new Product(4, "Camera", 646000);
		Product p5 = new Product(5, "Headphones", 10000);

		p1.display();

		p2.display();
		p3.display();
		p4.display();
		p5.display();
	}

}

class Product {
	int pid;
	String pname;
	int price;
	static String com_name = "Genpact";

	Product(int pid, String pname, int price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;

	}

	void display() {
		System.out.println(pid + "  " + pname + " " + price + " " + com_name);
	}

}