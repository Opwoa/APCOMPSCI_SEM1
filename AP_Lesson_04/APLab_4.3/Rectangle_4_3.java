import java.util.Scanner;

public class Rectangle_4_3 {	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the height in inches?");
		double height = keyboard.nextDouble();
		System.out.println("What is the length in inches?");
		double length = keyboard.nextDouble();
		
		double perim = calcPerim(length, height);
		print(perim);
	}
	
	public static double calcPerim(double l, double h) {
		return 2 * (l + h);
	}
	
	public static void print(double perimeter) {
		System.out.printf("Your rectangle is %1.5f ft. around.\n", perimeter);
	}
}