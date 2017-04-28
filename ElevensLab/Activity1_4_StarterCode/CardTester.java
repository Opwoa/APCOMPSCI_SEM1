/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card TenOfClubs = new Card("Ten", "Clubs", 10);
		System.out.println(TenOfClubs.rank());
		System.out.println(TenOfClubs.suit());
		System.out.println(TenOfClubs.pointValue());
		System.out.println(TenOfClubs);
		
		Card ElevenOfClubs = new Card("Eleven", "Clubs", 10);
		Card TenOfSpades = new Card("Ten", "Spades", 10);
		Card TenOfClubs2 = new Card("Ten", "Clubs", 10);
		
		System.out.println(TenOfClubs.matches(ElevenOfClubs));
		System.out.println(TenOfClubs.matches(TenOfSpades));
		System.out.println(TenOfClubs.matches(TenOfClubs2));
	}
}
