import java.util.Scanner;

public class FirstLetter {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.println("Enter five words");
		for (int i = 0; i < words.length; i++) {
			words[i] = keyboard.next();
		}
		
		first(words);
	}
	
	public static void first(String[] wordsArrayInsideMyMethodHere) {
		for (String word : wordsArrayInsideMyMethodHere) {
			System.out.println(word.charAt(0));
		}
	}
}