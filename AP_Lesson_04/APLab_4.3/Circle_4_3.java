import java.util.Scanner;

public class Circle_4_3 {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the radius?");
		double r = keyboard.nextDouble();

		print(r, calcArea(r));
	}
	
	public static double calcArea(double r) {
		return 3.14 * r * r;
	}
	
	public static void print(double radius, double area) {
		System.out.printf("The area of a circle with a radius of %1.5f is %1.5f\n", radius, area);
	}
}