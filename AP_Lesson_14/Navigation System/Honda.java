import java.util.Random;

public class Honda extends Car{
	private double[] location;
	
	public Honda() {
		location = new double[] {0,0};
	}
	
	public Honda(double[] loc) {
		location = loc;
	}

	public void move(double ex, double wiy) {
		location[0] += ex;
		location[1] += wiy;
	}
	
	public double[] getLoc() {
		return location;
	}

}