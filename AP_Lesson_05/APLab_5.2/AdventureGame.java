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
				System.out.println("Well . . . um . . . would you like to know my favorite color? Yes = (\"1\"). No = (\"2\")");
				if (keyboard.nextInt() == 1) {
					System.out.println("It's Green!\nThat's it. That's the minimum requirement and I am *not* adding more.\nOk. Bye");
				} else {
					System.out.println("Yeah you do.\nMy favorite color is green.\nOk thats the end of the story. Go away.");
				}
			} else {
				System.out.println("First off, I hate you.");
				System.out.println("Second off, all I've done so far is insult you so let's have a real story.");
				System.out.println("Once upon a time there were a brother and sister named Jack and Jill.\nThey go up the hill to fetch a pail of water.");
				System.out.println("Choose ending (\"1\") or ending (\"2\").");
				if (keyboard.nextInt() == 1) {
					System.out.println("Jack fell down and had permanent brain damage and Jill dropped dead at\nthe top from the poisoned well water and came tumbling down the hill.");
					System.out.println("There. It's over. Thanks for playing.");
				} else {
					System.out.println("The writer got tired of coming up with stuff.\nSo, yeah. The End.");
				}
			}
		} else {
			System.out.println("Good. Life is dispair.");
			System.out.println("Want to hear about a student (\"1\") or a teacher (\"2\")?");
			if (keyboard.nextInt() == 1) {
				System.out.println("A good student(\"1\") or a bad student(\"2\")?");
				if (keyboard.nextInt() == 1) {
					System.out.println("Well, I mean it's the same story just different perspectives.");
					System.out.println("But yeah, the good student struggled in school and had to watch the\nbad student do well in everything by cheating.");
					System.out.println("(It's actually a horror story.)");
				} else {
					System.out.println("The bad student goes through school and cheats but then life slaps\nhim in the face and he becomes homeless.");
					System.out.println("The End.");
				}
			} else {
				System.out.println("This teacher decided to use their sick days for a vacation.");
				System.out.println("Choose ending (\"1\") or ending (\"2\").");
				if (keyboard.nextInt() == 1) {
					System.out.println("They went to the beach and got bitten by a shark.\nHighly unfortunate.");
				} else {
					System.out.println("They went skiing and actually got sick.\nThis set off a chain of health issues.\nIrony");
				}
			}
		}
	}
}