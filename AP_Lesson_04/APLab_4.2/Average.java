import java.util.Scanner;

public class Average {
	static double num1 = 0;
	static double num2 = 0;
	static double num3 = 0;
	static double avg = 0;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the first number?");
		num1 = keyboard.nextDouble();
		System.out.println("What is the second number?");
		num2 = keyboard.nextDouble();
		System.out.println("What is the third number?");
		num3 = keyboard.nextDouble();

		average();
		print();
	}
	
	public static void average() {
		avg = (num1 + num2 + num3) / 3;
	}
	
	public static void print() {
		System.out.printf("The average of %1.5f, %1.5f, and %1.5f is %1.5f\n", num1, num2, num3, avg);
	}
}