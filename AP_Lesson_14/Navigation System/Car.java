import java.util.Random;

public abstract class Car implements Location{
	public Car() {
	}
	
    public int getID() {
		Random rand = new Random();
		return rand.nextInt(1000000);
	}
}