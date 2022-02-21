package com.org.gen.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3RestrauntMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isDone = false;
		Scanner sc = new Scanner(System.in);
		boolean placeOrder = false;

		int totalBill = 0;
		ArrayList<Items[]> menu = new ArrayList<Items[]>();
		initialiseMenu(menu);

		int choice;
		do {
			System.out.println("Please Enter  Your Choice : \n" + "1: South Indian\n" + "2: North Indian\n"
					+ "3: Rajasthani\n" + "4: Gujrati\n" + "5: Bengali\n" + "6: Dessert\n" + "7: Place order");
			choice = sc.nextInt() - 1;

			if (choice == 6) {
				placeOrder = true;
			} else {
				Items[] temp = menu.get(choice);
				int dishNum;
				System.out.println("Please Choose Dish:");
				for (int i = 0; i < temp.length; i++) {
					System.out.println((i + 1) + ": " + temp[i].name + "\t" + temp[i].price);

				}
				dishNum = sc.nextInt() - 1;
				totalBill += temp[dishNum].price;

				System.out.println("You ordered : " + temp[dishNum].name);
			}
			System.out.println("\t Current  Bill: " + totalBill);

		} while (!placeOrder);

		System.out.println("Thank you! Your Total Bill:\t " + totalBill);

	}

	private static void initialiseMenu(ArrayList<Items[]> menu) {

		Items[] South = { new Items(149, "Idli"), new Items(200, "Dosa"), new Items(200, "Uttapam") };
		Items[] North = { new Items(300, "Biryani"), new Items(280, "Paratha"), new Items(200, "Chicken") };
		Items[] Rajasthani = { new Items(149, "Dal Bati Churma"), new Items(290, "Mohan Maas"),
				new Items(250, "Gatte ki Khichdi") };
		Items[] Gujrati = { new Items(99, "Dhokla"), new Items(30, "Thepla"), new Items(70, "Fafda ") };
		Items[] Bengali = { new Items(349, "Aloo Potol Posto "), new Items(200, "Sandesh "),
				new Items(200, "Shukto ") };
		Items[] Dessert = { new Items(50, "Rasgulla"), new Items(20, "icecream"), new Items(30, "Colddrink") };
		menu.add(South);
		menu.add(North);
		menu.add(Rajasthani);
		menu.add(Gujrati);
		menu.add(Bengali);
		menu.add(Dessert);

	}

}

class Items {
	int price;
	String name;

	Items(int price, String name) {
		this.price = price;
		this.name = name;
	}
}
