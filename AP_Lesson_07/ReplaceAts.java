import java.util.Scanner;

public class ReplaceAts {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String sentence = keyboard.nextLine();

		System.out.println(replace(sentence));
	}
	
	public static String replace(String sent) {
		int charPos = 0;
		while (sent.contains("a")) {
			if (sent.charAt(charPos) == 'a') {
				sent.charAt(charPos) = '@';
			}
			charPos++;
		}
		return sent;
	}
}