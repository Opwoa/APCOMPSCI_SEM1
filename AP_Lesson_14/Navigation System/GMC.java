import java.util.Random;

public class GMC extends Car{
	private double x, y;
	
	public GMC() {
		x = 0;
		y = 0;
	}
	
	public GMC(double ex, double wiy) {
		x = ex;
		y = wiy;
	}
	
	public void move(double ex, double wiy) {
		x += ex;
		y += wiy;
	}
	
	public double[] getLoc() {
		double[] location = {x, y};
		return location;
	}

}