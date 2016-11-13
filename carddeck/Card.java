package carddeck;

// ALT+SHIFT+S+O, ALT+SHIFT+S+R
public class Card {
	Suit suit;
	Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public String toString() {
		return "[SUIT=" + suit + "; RANK=" + rank + "]";
	}
}
