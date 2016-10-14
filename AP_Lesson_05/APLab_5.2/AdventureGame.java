import java.util.Scanner;

public class AdventureGame {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Would you like to play through a happy story(\"1\") or a sad story(\"2\")?");
		if (keyboard.nextInt() == 1) {
			System.out.println("Well too bad. There's no such thing.");
			System.out.println("Are you trying to find happiness in an otherwise dull life(\"1\") or are you just an optimist(\"2\")?");
			if (keyboard.nextInt() == 1) {
				System.out.println("Sorry to disappoint.");
				System.out.println("(I'm not sorry.)");
				System.out.println("Oh, shoot. You're already at the end of the story and there's not even a story yet.");
				
				if (keyboard.nextInt() == 1) {
					System.out.println();
				} else {
					System.out.println();
				}
			} else {
				System.out.println("First off, I hate you.");
				System.out.println("Oh, shoot. You're already at the end of the story and there's not even a story yet.");
				if (keyboard.nextInt() == 1) {
					System.out.println();
				} else {
					System.out.println();
				}
			}
		} else {
			System.out.println("Good. Life is dispair.");
			if (keyboard.nextInt() == 1) {
				System.out.println();
				if (keyboard.nextInt() == 1) {
					System.out.println();
				} else {
					System.out.println();
				}
			} else {
				System.out.println();
				if (keyboard.nextInt() == 1) {
					System.out.println();
				} else {
					System.out.println();
				}
			}
		}
	}
}