import java.util.Random;

public abstract class Car implements Location{
	Random rand = new Random();
	
	public double[] location = new double[2];
	public final int ID = rand.nextInt(1000000);
	
	public Car() {
	}

	public void move(double xIn, double yIn) {
		location[0] += xIn;
		location[1] += yIn;
	}
	
    public int getID() {
		return ID;
	}

	public double[] getLoc() {
		return location;
	}
}