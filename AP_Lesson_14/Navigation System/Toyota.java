import java.util.Random;

public class Toyota extends Car{
	private double[] location = new double[]{0,0};
	
	public Toyota() {
	}
	
	public Toyota(String coords) {
		String[] tmp = coords.split(", ");
		super.location[0] = Double.parseDouble(tmp[0]);
		super.location[1] = Double.parseDouble(tmp[1]);
	}
}