import java.util.Scanner;

public class RightTriangle {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me something to work with here.");
		String awesomestStringEver = keyboard.nextLine();
		
		for (int i = awesomestStringEver.length() -1; i > 0; i--) {
			System.out.println(awesomestStringEver.substring(i, awesomestStringEver.length()));
		}
	}
}