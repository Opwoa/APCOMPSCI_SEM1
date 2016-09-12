import java.util.Scanner;

public class BMICalc {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		double height = keyboard.nextDouble();
		
		System.out.println("What is your weight in pounds?");
		double weight = keyboard.nextDouble();
		
		double heightSqr = height * height;
		double BMIStep2 = weight / heightSqr;
		double BMI = BMIStep2 * 703;
		System.out.println("Your BMI is " + BMI + ".");
	}
}