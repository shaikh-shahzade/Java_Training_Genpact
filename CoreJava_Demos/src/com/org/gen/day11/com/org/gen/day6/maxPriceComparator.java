package com.org.gen.day6;

import java.util.Comparator;

public class maxPriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		if (o1.price > o2.price)
			return 1;
		return -1;
	}

}
