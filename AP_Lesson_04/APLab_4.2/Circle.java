import java.util.Scanner;

public class Circle {
	static double r = 0;
	static double area = 0;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the radius?");
		r = keyboard.nextDouble();

		calcArea();
		print();
	}
	
	public static void calcArea() {
		area = 3.14159265358979 * r * r;
	}
	
	public static void print() {
		System.out.printf("The area of a circle with a radius of %1.5f is %1.5f\n", r, area);
	}
}