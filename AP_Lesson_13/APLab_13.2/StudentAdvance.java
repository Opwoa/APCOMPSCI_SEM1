public class StudentAdvance extends Advance {
	public StudentAdvance(int p) {
		super(p);
	}
	
	public double getPrice() {
		if (daysLeft >= 10) {
			return 15.00;
		} else {
			return 20.00;
		}
 	}
	
	public String toString() {
		return "\nSerial #: " + this.getSerialNo() +
				"\nPrice: " + this.getPrice() +
				"\nSTUDENT ID REQUIRED";
	}
}