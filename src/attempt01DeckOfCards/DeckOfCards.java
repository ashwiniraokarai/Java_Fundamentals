package attempt01DeckOfCards;

public class DeckOfCards {
	// Call getCard 52 times
	// 13 ranks for each of the 4 suits
	// Lets create the 13 iteration loop for one rank to begin with

	Card[] cards; // Having your declaration for variable that can hold an array of Card objects 
					// outside the constructor will enable you to access the card objects and their data
					// anywhere throughout this DeckOfCards object

		DeckOfCards() {
		cards = new Card[13]; // The array creation. This is NOT the Card object instantiation. This is an
								// array object that CAN HOLD REFERENCES
								// to 13 objects of type card (or simply put, 13 card objects)
								// We choose 13 because each suit has 13 ranks on it

		String suit1 = "Diamond";
		String suit2 = "Club";
		String suit3 = "Heart";
		String suit4 = "Spade";

		String suit = null;

		// You want to run 13 object instantiations for each of the 4 suits 13*4=52 card
		// object instantiations for a full deck of card.
		// The outer loop sets one suit on every iteration, the inner loop sets 1 rank
		// for every iteration and sets a suit and rank to a card object it instantiates.
		// Outer loop runs 4 times in total. Inner loop runs 13 times for EACH ITERATION of the OUTER LOOP.
		// Every iteration of the outer loop therefore instantiates 13 card objects before the next iteration of the outer loop begins

		for (int k = 0; k < 4; k++) {
			System.out.println("\n");
			System.out.println("---Entering Outer Loop");
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
				break; // exiting loop
			}

			// Inner for loop here

			for (int i = 0; i < 13; i++) {
				System.out.println("Entering Inner Loop");
				cards[i] = new Card(); // The object instantiation for each of the 13 Card objects stored in an array
										// object earlier
				int j = i + 1;
				cards[i].setCard(suit, j); // You want to pass values from 1 to 13; so you can't use the array index/
											// loop counter(i) directly to set a card object's rank state because of the rank being
											// one count ahead
											// of the index based loop counter. When array index i=0, you want your
											// rank=1
				//System.out.println(cards[i].getSuit());
				//System.out.println(cards[i].getRank());

			} // inner for

		} // outer for
	}// constructor
	
	//You can return the cards object to the calling code/ program. However, you cannot do it via the constructor because constructors don't
	//have return types. You can create a tiny method that will simply return the card objects. 
	
	Card[] getDeckOfCards() {
		//want to return the entire deck of cards. but it only returns 13.
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i].getSuit());
			System.out.println(cards[i].getRank());
		}
		return cards;
	}
	

	public static void main(String args[]) {
		DeckOfCards aDeckOfCards = new DeckOfCards();
		Card[] cards = aDeckOfCards.getDeckOfCards();
		//You will still need to create the nested loop structure to access the values because what other way do you have, in order  to access 
		//each of the  52 cards' values? DeckOfCards constructor in only helping in creating 52 cards. You have to recreate the rest of the code
		//to set the cards and get the cards. 
		//"cards" object array has retained only the last 13 values (spade)
		
		//Conclusion: Creating a two dimensional array on your constructor will help you store and RETAIN the initialized values and you can easily retrieve them outside
		//of the constructor. Do this tomorrow. Yayyy!!!! PICK UP FROM HERE
		//P.S: What you have done is great. You have initialized the values. You just coudn't store them or rather save all the statest. The first 13 
		//sets lost their references in your limited one dimensional 13 slot array.
	}//end main
}//end class
