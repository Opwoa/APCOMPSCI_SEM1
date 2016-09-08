import java.util.Scanner;

public class RudeAI {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi! my name is RudeAI.\nI would like to ask you a few questions.\nWhat is your name?");
		String name = keyboard.nextLine();
		System.out.println("Wow, " + name + " is a really dumb name. Couldn't you have come up with something better?");
		
		System.out.println("Anyways, " + name + ", how old are you?");
		int age = keyboard.nextInt();
		System.out.println("Yeah, suure you're " + age + ". And I'm Michael Jackson.");
		
		keyboard.nextLine();
		
		System.out.println("So what do you like to do in your free time?\nI'm sure its somthing lame that only " + age + " year olds do.");
		String hobby = keyboard.nextLine();
		System.out.println(hobby + " is actually a really cool hobby!\nIf you're trying to scare away everyone you meet.");
		
		System.out.println("What about music? What music do you listen to?");
		String musGenre = keyboard.nextLine();
		System.out.println("Are you trying to kill your ears by listening to " + musGenre + "?");
		
		System.out.println("How many siblings do you have?");
		int sibNum = keyboard.nextInt();
		if (sibNum == 0) {
			System.out.println("Wow, is third wheeling your parents for life as fun as it sounds?");
		} else {
			System.out.println("Well, given how this is going, I do not want to meet them.");
		}
		
		keyboard.nextLine();

		System.out.println("So tell me, " + name + ", what would you like to be when you grow up?");
		String dreamJob = keyboard.nextLine();
		System.out.println("Ha! Let me know if you ever become a " + dreamJob + ". You'll reach me at my address on Venus.");
		
		System.out.println("Let's recap, " + name + ".\nYou're supposedly a " + age + " years old who likes to " + hobby + " and listen to " + musGenre + ".");
		System.out.println("You have " + age + " siblings and an outrageous dream of becoming a " + dreamJob + ".\nWell, have a nice day, loser.");
	}
}