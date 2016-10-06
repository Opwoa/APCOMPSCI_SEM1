import java.util.Random;

public class Excercise5_1 {
	static int playRoll = 0;
	static int compRoll = 0;
	static String winner = null;
	
	public static void main(String[]args) {
		Random rand = new Random();
		playRoll = rand.nextInt(6) + 1;
		compRoll = rand.nextInt(6) + 1;
		
		rollDice();
		
		System.out.println("You rolled a " + playRoll);
		System.out.println("Computer rolled a " + compRoll);
		if (winner == "tie") {
			System.out.println("You tied with the computer");
		} else {
			System.out.println("Winner is " + winner);
		}
	}
	
	public static void rollDice() {
		if (playRoll > compRoll) {
			winner = "you";
		} else if (compRoll > playRoll) {
			winner = "computer";
		} else {
			winner = "tie";
		}
	}
}