import java.util.Scanner;

public class Average_4_3 {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the first number?");
		double num1 = keyboard.nextDouble();
		System.out.println("What is the second number?");
		double num2 = keyboard.nextDouble();
		System.out.println("What is the third number?");
		double num3 = keyboard.nextDouble();

		print(num1, num2, num3, average(num1, num2, num3));
	}
	
	public static double average(double one, double two, double three) {
		return (one + two + three) / 3;
	}
	
	public static void print(double numOne, double numTwo, double numThree, double avg) {
		System.out.printf("The average of %1.5f, %1.5f, and %1.5f is %1.5f\n", numOne, numTwo, numThree, avg);
	}
}