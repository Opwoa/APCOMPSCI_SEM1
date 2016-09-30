import java.util.Scanner;

public class Cube_4_3 {
	static double sa = 0;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the side length?");
		double side = keyboard.nextDouble();

		print(side, calcSurf(side));
	}
	
	public static double calcSurf(double s) {
		return 6 * s * s;
	}
	
	public static void print(double sideLength, double sa) {
		System.out.printf("The surface area of a cube with %1.5f length sides is %1.5f\n",sideLength, sa);
	}
}