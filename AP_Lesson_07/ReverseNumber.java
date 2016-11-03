import java.util.Scanner;

public class ReverseNumber {
	public static int rev = 0;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = keyboard.nextInt();
		
		getReversed(number);
		System.out.println(number + " reversed is " + rev);
	}
	
	public static void getReversed(int num) {
		while (num > 0) {
			rev *= 10;
			rev += (num % 10);
			num /= 10;
		}
	}
}