import java.util.Scanner;

public class BMIPart2 {
	static double BMI = 0.0;
	static String condition = null;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		double height = keyboard.nextDouble();
		
		System.out.println("What is your weight in pounds?");
		double weight = keyboard.nextDouble();
		
		calcBMI(height, weight);
		
		System.out.println("Your BMI is: " + BMI + "\nYou are " + condition);
	}
	
	public static void calcBMI(double h, double w) {
		double hSqr = h * h;
		double BMIStep2 = w / hSqr;
		BMI = BMIStep2 * 703;
		
		if (BMI > 39.9) {
			condition = "morbidly obese";
		} else if (BMI >= 35.0) {
			condition = "very obese";
		} else if (BMI >= 29.9) {
			condition = "obese";
		} else if (BMI >= 25.0) {
			condition = "overweight";
		} else if (BMI >= 18.5) {
			condition = "normal";
		} else {
			condition = "underweight";
		}
	}
}