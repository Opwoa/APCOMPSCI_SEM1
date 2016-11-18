import java.util.Scanner;

public class TreeDeg60 {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String word = keyboard.next();
		
		tree(word, 1, word.length());
	}
	
	public static String tree(String word, int start, int stop){
		if (start <= stop) {
			System.out.printf("%10s\n", word.substring(0, start));
			return tree (word, start +1, stop);
		} else {
			return " ";
		}
	}
}