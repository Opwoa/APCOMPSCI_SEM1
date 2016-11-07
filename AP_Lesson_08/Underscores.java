import java.util.Scanner;

public class Underscores {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String sentence = keyboard.nextLine();

		System.out.println(replace(sentence));
	}
	
	public static String replace(String sent) {
		if (!sent.contains(" ")) {
			return sent;
		} else {
			return replace(sent.substring(0, sent.indexOf(" ")) + "_" + sent.substring(sent.indexOf(" ") + 1));
		}
	}
}