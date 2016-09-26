import java.util.Scanner;

public class Rectangle {
	static double perimeter = 0;
	static double height = 0;
	static double length = 0;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the height in inches?");
		height = keyboard.nextDouble();
		System.out.println("What is the length in inches?");
		length = keyboard.nextDouble();
		
		perimeter = calcPerim(height, length);
		print(perimeter);
	}
	
	public static double calcPerim(double h, double l) {
		return 2 * h + 2 * l;
	}
	
	public static void print(double perim) {
		System.out.printf("Your rectangle is %1.5f ft. around.\n", perim);
	}
}