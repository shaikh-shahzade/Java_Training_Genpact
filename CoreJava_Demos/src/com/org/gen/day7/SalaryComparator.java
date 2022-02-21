package com.org.gen.day7;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Developer> {

	@Override
	public int compare(Developer o1, Developer o2) {
		// TODO Auto-generated method stub
		if (o1.salary > o2.salary)
			return 1;
		return -1;
	}

}
