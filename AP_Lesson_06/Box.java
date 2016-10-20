import java.util.Scanner;

public class Box {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Say something; I'm giving up on you.");
		String yeeBoiii = keyboard.nextLine();
		
		for (int i = 0; i < yeeBoiii.length(); i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < yeeBoiii.length(); i++) {
			System.out.println(yeeBoiii);
		}
	}
}