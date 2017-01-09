import java.util.Random;
import java.util.Scanner;

public class GameHealth {
	public static int healthCount;
	public static int ALLCAPSVARIABLEBECAUSEIMANGRY = 6;
	public static String[] health;
	
	public static void main(String[]args) {
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[ALLCAPSVARIABLEBECAUSEIMANGRY];
		
		while((!turn.equals("Q")) && healthCount > 0) {
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = keyboard.nextLine();
			
			damage = rand.nextInt(2) + 1;
			amount = rand.nextInt(6) + 1;
			
			System.out.println(takeDamage(damage, amount));
			printHealth();
		}
		System.out.println("D-E-D: Ded");
	}

	public static String takeDamage(int dmg, int amt) {
		if (dmg == 1) {
			healthCount -= amt;
			return "Taking " + amt + " damage!\n";
		} else {
			if(healthCount + amt < ALLCAPSVARIABLEBECAUSEIMANGRY) {
				healthCount += amt;
			} else {
				healthCount = ALLCAPSVARIABLEBECAUSEIMANGRY;
			}
			return "Power Up " + amt + "\n";
		}
	}

	public static void printHealth() {
		String output = "Health:\t";
		for(int i = 0; i < ALLCAPSVARIABLEBECAUSEIMANGRY; i++) {
			if(i < healthCount) {
				health[i] = " @ ";
			} else {
				health[i] = "[] ";
			}
			output = output.concat(health[i]);
		}
		System.out.println(output + "\n");
	}
}