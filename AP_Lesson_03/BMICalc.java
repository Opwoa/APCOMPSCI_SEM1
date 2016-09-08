import java.util.Scanner;

public class BMICalc {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		int height = keyboard.nextInt();
		
		System.out.println("What is your weight in pounds?");
		int weight = keyboard.nextInt();
		
		int heightSqr = height * height;
		float BMIStep2 = weight / heightSqr;
		float BMI = BMIStep2 * 703;
		System.out.println("Your BMI is " + BMI + ".");
	}
}