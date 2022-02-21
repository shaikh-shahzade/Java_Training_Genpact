package com.org.gen.day7;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Developer> {

	@Override
	public int compare(Developer o1, Developer o2) {
		// TODO Auto-generated method stub

		if (o1.name.compareToIgnoreCase(o2.name) > 0)
			return 1;
		return -1;
	}

}
