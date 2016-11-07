import java.util.Scanner;

public class Center {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter word one");
		String word1 = keyboard.next();
		
		System.out.println("Enter word two");
		String word2 = keyboard.next();
		
		System.out.println("Enter word three");
		String word3 = keyboard.next();

		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	
	public static String makeCenter(String word) {
		if (word.length() >= 20) {
			return word;
		} else {
			return makeCenter(" " + word + " ");
		}
	}
}