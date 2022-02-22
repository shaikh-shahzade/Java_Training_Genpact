package com.org.gen.day3;

class Car {
	String carname;
	String carType;

	Car(String name) {
		super();
		this.carname = name;
	}

	private String getCarname() {
		return carname;
	}

	class Engine {
		String engineType;

		void setEngine() {
			this.engineType = "Bigger";
			System.out.println(Car.this.carname);
		}

		void getEngine() {
			System.out.println(Car.this.getCarname() + ": " + this.engineType);
		}
	}

}

public class PracticeNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car("Honda");
		Car.Engine eng = car.new Engine();

		eng.setEngine();
		eng.getEngine();
	}

}
