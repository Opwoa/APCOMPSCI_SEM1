import java.util.Scanner;

public class Cube {
	static double side = 0;
	static double sa = 0;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the side length?");
		side = keyboard.nextDouble();

		calcSurf();
		print();
	}
	
	public static void calcSurf() {
		sa = 6 * side * side;
	}
	
	public static void print() {
		System.out.printf("The surface area of a cube with %1.5f length sides is %1.5f\n", side, sa);
	}
}