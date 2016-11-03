import java.util.Scanner;

public class AverageDigits {
	public static int digits = 0;
	public static double avg = 0;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = keyboard.nextInt();
		
		avDigits(number);
		System.out.println("The average of the digits of " + number + " is " + avg);
	}
	
	public static void avDigits(int num) {
		while (num > 0) {
			digits ++;
			avg += (num % 10);
			num /= 10;
		}
		avg /= digits;
	}
}