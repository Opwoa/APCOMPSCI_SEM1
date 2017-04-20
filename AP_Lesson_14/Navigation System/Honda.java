import java.util.Random;

public class Honda extends Car{
	public Honda() {
		location = new double[] {0,0};
	}
	
	public Honda(double[] loc) {
		super.location = loc;
	}
}