import java.util.Scanner;

public class Strings {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		String[][] words = new String[4][4];
		
		for(int i = 0; i < words.length; i++) {				//fill double scripted array
			for(int j = 0; j < words[i].length; j++) {
				System.out.println("Enter a word:");
				words[i][j] = keyboard.next();
			}
		}
		
		for(int i = 0; i < words.length; i++) {				//print double scripted array
			for(int j = 0; j < words[i].length; j++) {
				System.out.printf("%-10s ", words[i][j]);		//printf to format
			}
			System.out.println();
		}
	}
}