package attempt02DeckOfCards;

public class DeckOfCards {
	// Call getCard 52 times
	// 13 ranks for each of the 4 suits

	private Card[][] cards; /*
					 * Having your declaration for variable that can hold an array of Card objects
					 * outside the constructor will enable you to access the card objects and their stored
					 * data anywhere throughout this DeckOfCards object
					 */

	public DeckOfCards() {
		cards = new Card[4][13]; /*
									 * The array creation. This is NOT the Card object instantiation. This is an
									 * array object that CAN HOLD REFERENCES to 52 objects of type card (or simply
									 * put, 52 card objects) Why [4] and [13]? That's because we have 4 suits and
									 * each suit has 13 ranks on it. This can be visualized as a grid 4 rows with 13
									 * columns each. Each row represents a suit and each column a rank.
									 */

		String suit1 = "Diamond";
		String suit2 = "Club";
		String suit3 = "Heart";
		String suit4 = "Spade";

		String suit = null;

		for (int k = 0; k < 4; k++) { // 4 rows
			// System.out.println("\n");
			// System.out.println("---Entering Outer Loop");
			if (k == 0) {
				// Pass "Diamond"
				suit = suit1;
			} else if (k == 1) {
				// Pass "Club"
				suit = suit2;
			} else if (k == 2) {
				// Pass "Heart"
				suit = suit3;
			} else if (k == 3) {
				// Pass "Spade"
				suit = suit4;
			} else {
				// card out of deck range
				System.out.println("Out of range suit. Exiting outer loop");
				break; // exiting outer loop. Not going to inner loop.
			}

			// Inner for loop here

			for (int i = 0; i < 13; i++) { // 13 columns in every row
				// System.out.println("Entering Inner Loop");
				int j = i + 1;
				cards[k][i] = new Card(suit, j); /*
											 * The object instantiation for each of the 13 Card objects stored in an
											 * array object earlier

												 * You want to pass values from 1 to 13; so you can't use the array
												 * index/ loop counter(i) directly to set a card object's rank state
												 * because of the rank being one count ahead of the index based loop
												 * counter. When array index i=0, you want your rank=1
												 */
				// System.out.println(cards[k][i].getSuit());
				// System.out.println(cards[k][i].getRank());

			} // inner for

		} // outer for
	}// constructor

	/*
	 * You can return the cards object to the calling code/ program. However, you
	 * cannot do it via the constructor because constructors don't have return
	 * types. You can create a tiny method that will simply return the card objects.
	 */
	
	public void displayDeckOfCards() {
		//display every card object in the deck of card objects
		
		  System.out.println("\n---------------------");
		  System.out.println("Getting a deck of cards: ");
		  System.out.println("With {} rows: " +cards.length);
		  
		  for (int k = 0; k < cards.length; k++) {
		  	System.out.println("\n---------------------"); 
		  	System.out.println("Batch: "+(k+1));  //We want to display Batch 1 to 4 instead of 0 to 3
		  	System.out.println("Number of cards:" +cards[k].length); 
		  
		  		for (int i = 0; i < cards[k].length; i++) { 
		  			System.out.format("%s of %s%n",cards[k][i].getRank(), cards[k][i].getSuit());
		  			//System.out.println(cards[k][i].getSuit());
		  			//System.out.println(cards[k][i].getRank()); 
		  		}
		  }
	}
	
	public Card getCard(int suit, int rank) { 
		return cards[suit][rank]; /*you are returning an individual card object from your array and not returning the array of card objects i.e, the ineternal data
		 							structure that holds the card objects. By doing this you protect the card objects instantiated
		 							here and stored in an array from being reset from the outside world (integrity). You aren't providing a
		 							setCard method here either. So card object values cannot be overwritten.
		 						 */
	}

	public static void main(String args[]) {
		DeckOfCards aDeckOfCards = new DeckOfCards();
		/* Call displayDeckOfCards method directly to see values of all Card objects in the deck in one shot
		*/
		aDeckOfCards.displayDeckOfCards();
										/*To retrieve the suit and rank values of a specific card object call the getCard method
										 */
		Card card = aDeckOfCards.getCard(1, 3);
		System.out.println("\n------Testing retrieval of specific, single card object values from the deck");
		System.out.println(card.getSuit());
		System.out.println(card.getRank());
		
	}// end main
}// end class
