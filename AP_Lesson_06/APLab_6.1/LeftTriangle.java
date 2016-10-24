import java.util.Scanner;

public class LeftTriangle {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me something to work with here.");
		String awesomestStringEver = keyboard.nextLine();
		
		for (int i = 0; i <= awesomestStringEver.length() - 1; i++) {
			System.out.println(awesomestStringEver.substring(i, awesomestStringEver.length()));
		}
	}
}