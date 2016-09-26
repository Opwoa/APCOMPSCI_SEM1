import java.util.Scanner;

public class AvgCalc {
	public static void main(String[]args) {
		System.out.println("Hello! I can calculate th average of any data set you give me.");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many pieces of data do you have?");
		double n = keyboard.nextDouble();

		System.out.println("Enter each piece of data separated by a space");
		double sum = 0;
		for (int i = 0; i < n; i++) {
			double currentNum = keyboard.nextDouble();
			sum = sum + currentNum;
		}
		
		double avg = sum / n;
		System.out.println("Your Average is " + avg + ".");
	}
}