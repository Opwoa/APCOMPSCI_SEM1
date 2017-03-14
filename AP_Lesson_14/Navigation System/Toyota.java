import java.util.Random;

public class Toyota extends Car{
	private double[] location = new double[]{0,0};
	
	public Toyota() {
	}
	
	public Toyota(String coords) {
		String[] tmp = coords.split(", ");
		location[0] = Double.parseDouble(tmp[0]);
		location[1] = Double.parseDouble(tmp[1]);
	}

	public void move(double ex, double wiy) {
		location[0] += ex;
		location[1] += wiy;
	}
	
	public double[] getLoc() {
		return location;
	}

}