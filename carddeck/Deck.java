package carddeck;

import java.util.Arrays;

public class Deck {

	static Card[] cards = new Card[52];

	static {
		int i = 0;
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards[i++] = new Card(suit, rank);
			}
		}
	}

	public static void main(String[] args) {
		Card[] frenchCards = Deck.cards;
		System.out.println(Arrays.toString(frenchCards));
	}
}
