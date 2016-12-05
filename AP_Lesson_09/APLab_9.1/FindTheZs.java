import java.util.Scanner;

public class FindTheZs {
	public static String[] words = new String[5];

	public static void main(String[]args) {		
		fillArray();
		
		System.out.print("For the following words:");
		printArray();
		System.out.println("\nOnly " + hasZs() + "contain(s) the letter z." );
	}
	
	public static void fillArray() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter five words");
		for (int i = 0; i < words.length; i++) {
			words[i] = keyboard.next();
		}
	}
	
	public static void printArray() {
		for (String word : words) {
			System.out.print(" " + word);
		}
	}
	
	public static String hasZs() {
		String zs = "";
		for (String word : words) {
			if (word.contains("z") || word.contains("Z")) {
				zs = zs + word + " ";
			}
		}
		return zs;
	}
}