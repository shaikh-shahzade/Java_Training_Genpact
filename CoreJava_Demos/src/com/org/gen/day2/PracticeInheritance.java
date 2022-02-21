package com.org.gen.day2;

public class PracticeInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HondaCity myCar = new HondaCity("Honda City");
		myCar.sound("Great Sound");
		myCar.engine(220);
		myCar.price(2000000);
		myCar.sitting(8);
		myCar.color("Red");
		myCar.model("M2231");
		myCar.HP(320);
		myCar.features();

	}

}

class Vehicle {

	void sound(String s) {
		System.out.println(s);
	}

	void engine(int power) {
		System.out.println("Power:" + power + "CC");
	}

	void price(int price) {
		System.out.println("Price is:" + price + "Rs");
	}

	void sitting(int per) {
		System.out.println("Sitting Space:" + per + " Persons");
	}

}

class Car extends Vehicle {

	public Car() {

		System.out.println("This is Car class Constructor");
	}

	void color(String col) {
		System.out.println("Color is:" + col);
	}

	void model(String mName) {
		System.out.println("Model name:" + mName);
	}

}

class Honda extends Car {
	void HP(int hp) {
		System.out.println("HP is:" + hp);
	}
}

class HondaCity extends Honda {
	HondaCity(String name) {
		System.out.println("Name: " + name);
	}

	void features() {
		System.out.println("Honda City is Best Car for Indians");
	}
}