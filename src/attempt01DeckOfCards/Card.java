/**
 * 
 */
package attempt01DeckOfCards;

/**
 * @author Ash
 *
 */
public class Card {

	/**Goal: Every Card Object must be able of generate a playing card
	 * We know that each card is made of 2 parts: The "suit" and the "rank" that uniquely identify EACH card (=>attributes)
	 * Cue: we need 2 instance variables that can uniquely identify a card 
	 * @param args
	 */
	
	/*Let's begin with a SINGLE CARD with a FIXED VALUES of suit and rank. We can than build on it to GENERATE A CARD with any combination
	 * of suit and rank
	 * 
	 */
	
	String suit;//Should entertain "diamond","club","heart","spade"
	int rank; //This variable should be able to entertain integers 2 to 10 as well as Strings (for Ace, King, Queen, Jack) 
	
	//Initialize a card via the best practice - constructor
	Card(){
		
		suit = "nothing";
		rank = 0;
	}
	
	String getSuit(){
		return suit; //remember get is synonymous with returning a value to the calling code
	}
	
	int getRank() {
		return rank;
		
	}
	
	Card getCard() {
		return this;
		
	}
	void setCard(String suit, int rank) {
		this.suit = suit;
		this.rank = rank;
		
	}
	
	/*---Commenting main(). Needed this only for simulating this object's (Card Object) behavior with outside world
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Card aCard = new Card();
	 System.out.println(aCard.getSuit());
	 System.out.println(aCard.getRank());
	 aCard.setCard("club", 2);
	 System.out.println(aCard.getSuit());
	 System.out.println(aCard.getRank());
	 System.out.println(aCard.getCard());
	
	}*/

}
