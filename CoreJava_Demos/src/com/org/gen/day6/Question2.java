package com.org.gen.day6;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cricketer = { "Dhoni Batsman", "Malinga Bowler", "Virat Batsman", "Rohit Fielder", "Sachin AllRounder",
				"Sourav Bowler", "Sehwag Batsman", "Yuvraj Bowler", "Suresh Fielder", "Gautam Fielder",
				"Dravid Batsman" };

		int batsman = 0;
		int bowler = 0;
		int fielder = 0;
		int allRounder = 0;

		for (int i = 0; i < cricketer.length; i++) {
			if (cricketer[i].endsWith("Batsman"))
				batsman++;
			else if (cricketer[i].endsWith("Bowler"))
				bowler++;
			else if (cricketer[i].endsWith("Fielder"))
				fielder++;
			else if (cricketer[i].endsWith("AllRounder"))
				allRounder++;

		}
		System.out.println("Total Batsman: " + batsman);
		System.out.println("Total Bowler: " + bowler);
		System.out.println("Total Fielder: " + fielder);
		System.out.println("Total AllRounder: " + allRounder);

	}

}
