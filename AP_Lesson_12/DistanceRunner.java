import java.util.Scanner;

public class DistanceRunner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first x-coordinate:");
		int xOne = keyboard.nextInt();
		System.out.println("Enter first y-coordinate:");
		int yOne = keyboard.nextInt();
		System.out.println("Enter second x-coordinate:");
		int xTwo = keyboard.nextInt();
		System.out.println("Enter second y-coordinate:");
		int yTwo = keyboard.nextInt();
		
		Distance dist = new Distance(xOne, yOne, xTwo, yTwo);
		
		System.out.println("Distance between (" + xOne + "," + yOne + ") and ("
							+ xTwo + "," + yTwo + ") = " + dist.getDist());
		
		dist.setValues(2, 1, 4, 8);
		
		System.out.println("Distance between (2,1) and (4,8) = "+ dist.getDist());
	}

}
