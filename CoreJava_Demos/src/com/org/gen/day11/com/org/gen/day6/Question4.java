package com.org.gen.day6;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeSet<Book> ts1 = new TreeSet<>();

		for (int i = 1; i <= 2; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();

			String publisher = sc.nextLine();
			int quantity = sc.nextInt();
			int price = sc.nextInt();

			ts1.add(new Book(id, name, publisher, quantity, price));

		}

		Book maxB = Collections.max(ts1, new maxPriceComparator());
		System.out.println("Max Price Book: " + maxB.name);

		ts1.forEach(b -> {
			if (b.publisher == "Galvin")
				System.out.println(b.name + " is Published by Galvin");
		});

	}

}
