import java.util.Scanner;

public class ReverseWord {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.println("Enter five words");
		for (int i = 0; i < words.length; i++) {
			words[i] = keyboard.next();
		}
		
		System.out.println("\n\nIn Order:");
		for (String word : words) {
			System.out.println(word);
		}
		
		System.out.println("\nReversed:");
		reverse(words);
	}
	
	public static void reverse(String[] wordsArrayInsideMyMethodHere) {
		for (int i = wordsArrayInsideMyMethodHere.length - 1; i >= 0; i--) {
			System.out.println(wordsArrayInsideMyMethodHere[i]);
		}
	}
}