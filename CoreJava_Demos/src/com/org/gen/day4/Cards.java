package com.org.gen.day4;

public class Cards {

	private int rank;
	private int suit;

	String ranks[] = { "ACE", "DEUCE", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN",
			"KING" };

	String suits[] = { "SPADES", "CLUBS", "HEARTS", "DIAMONDS" };

	public Cards(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}

	public void showCards() {
		int randomRank = (int) (Math.random() * 12);
		int randomSuit = (int) (Math.random() * 4);

		System.out.println("Card : " + ranks[randomRank] + " Of  " + suits[randomSuit]);

	}

}
