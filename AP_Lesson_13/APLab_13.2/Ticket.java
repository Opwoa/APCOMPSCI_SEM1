import java.util.Random;

public abstract class Ticket {
	private int serialNo;
	
	public Ticket() {
		Random rand = new Random();
		this.serialNo = rand.nextInt(10000000);
	}
	
	public int getSerialNo() {
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString() {
		return "\nSerial #: " + this.getSerialNo() +
				"\nPrice: " + this.getPrice();
	}
}
