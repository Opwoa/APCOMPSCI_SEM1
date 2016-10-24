import java.util.Scanner;

public class CountByX {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Count up to ");
		int thouShaltNotGoAboveThisNumber = keyboard.nextInt();
		
		System.out.print("\b by ");
		int numberToCountBy = keyboard.nextInt();

		System.out.print(numberToCountBy);
		for (int i = 2 * numberToCountBy; i <= thouShaltNotGoAboveThisNumber; i += numberToCountBy) {
			System.out.print("\t" + i);
		}
	}
}