public class Advance extends Ticket {
	public int daysLeft;

	public Advance(int p) {
		super();
		daysLeft = p;
	}
	
	public double getPrice() {
		if (daysLeft >= 10) {
			return 30.00;
		} else {
			return 40.00;
		}
 	}
}