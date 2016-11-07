import java.util.Scanner;

public class Lucky7s {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = keyboard.nextInt();

		System.out.println("There are " + luck(number) + " lucky 7s in your number.");
	}
	
	public static int luck(int num) {
		if (num > 0) {
			if (num % 10 == 7) {
				return 1 + luck(num / 10);
			} else {
				return luck(num / 10);
			}
		} else {
			return 0;
		}
	}
}