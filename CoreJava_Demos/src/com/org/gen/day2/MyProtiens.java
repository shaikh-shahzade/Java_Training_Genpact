package com.org.gen.day2;

public class MyProtiens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sources sr = new Sources();

	}

}

class Protiens {

	public Protiens() {
		super();
		System.out.println("There are 7 types of protien \n"
				+ "antibodies, contractile proteins, enzymes, hormonal proteins, structural proteins, storage proteins, and transport proteins.");

	}

}

class Sources extends Protiens {

	public Sources() {
		this("Sources Are:\n" + "lean meats\r\n" + "poultry\r\n" + "fish and seafood \r\n" + "eggs.\r\n"
				+ "dairy products ");

	}

	Sources(int i) {
		System.out.println("Amount of Protein required: " + i + " grams");
	}

	Sources(String sources) {
		this(500);
		System.out.println(sources);
	}

}