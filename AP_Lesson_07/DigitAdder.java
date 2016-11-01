import java.util.Scanner;

public class DigitAdder {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = keyboard.nextInt();
		
		System.out.println("The sum of the digits of " + number + " is " + sumDigits(number));
	}
	
	public static int sumDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}
}