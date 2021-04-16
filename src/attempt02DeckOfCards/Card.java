/**
 * 
 */
package attempt02DeckOfCards;

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
	
	private final String SUIT;//Should entertain strings "diamond","club","heart","spade"
	private final int RANK; //Ideally, this variable should be able to entertain integers 2 to 10 as well as Strings (for Ace, King, Queen, Jack)
	
	
	String[] validSuits = {"DIAMOND","CLUB","HEART","SPADE"};
	
	//Acceptable values for rank here
	int ace = 1; //minimum
	
	/**
	int two to int queen were variables declared originally but never used. But it helps provide visibility to the the range of acceptable ranks inputs
	int two = 2;
	int three = 3;
	int four = 4;
	int five = 5;
	int six = 6;
	int seven = 7;
	int eight = 8;
	int nine = 9;
	int ten = 10;
	int jack = 11;
	int queen = 12;
	**/
	
	int king = 13; //maximum

	
	//Initialize a card via the best practice - constructor
	public Card(String suit, int rank){
		
		//if suit = <range of values, accept and allow initialization> else stop execution
		//if rank = <range of values, accept and allow initialization> else stop execution
		
		boolean flag = false;
		//suit check
		System.out.println("\n------");
		System.out.println(suit);
		
		for (int i = 0; i < validSuits.length; i++) {
			if(suit.equalsIgnoreCase(validSuits[i])) {
				System.out.println("Suit in range");
				flag = true;
				break;
			} else {
				continue;
			}
		}//end for
		
		if(flag == false) {
			System.out.println("Suit out of range. Exiting program");
			//assert here. Execution will stop right here without proceeding to initialization.
			assert flag;
		}
			
		this.SUIT = suit; //flag = true. Initialization approved.
		
		
		//rank check
		System.out.println(rank);
		if ((rank>=ace) && (rank<=king)) {
			System.out.println("Rank in range");
		}else {
			System.out.println("Rank out of range. Exiting program");
			//assert here and do not allow execution to continue
			assert ((rank>=ace) && (rank<=king));
		}
		
		this.RANK = rank; //Initialization approved. If there was an exception, program would have quit due to the assert
		
	}//end constructor
	
	public String getSuit(){
		return SUIT; //remember "get" is synonymous with returning a value to the calling code
	}
	
	public int getRank() { 
		return RANK;
		
	}
	
	public Card getCard() {//never really called
		return this;
	}
	
	/*	This method is no more meaningful because instance variables suit and rank have been made FINAL. They can only be
	 * INITIALZED but not OVERWRITTEN.
	 *
	 * public void setCard(String suit, int rank) { You can skip this method entirely and provide the functionality directly through the 
										  constructor
										  
		this.suit = suit;
		this.rank = rank;
		
	}*/
	
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
