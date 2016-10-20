import java.util.Scanner;

public class ReverseTriangle {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me something to work with here.");
		String awesomestStringEver = keyboard.nextLine();
		
		for (int i = awesomestStringEver.length(); i > 0; i--) {
			System.out.println(awesomestStringEver.substring(0, i));
		}
	}
}