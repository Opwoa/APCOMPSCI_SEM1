import java.util.Scanner;

public class HumanDriver {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter hair color:");
		String hair = keyboard.nextLine();
		System.out.println("Enter eye color:");
		String eyes = keyboard.nextLine();
		System.out.println("Enter skin color:");
		String skin = keyboard.nextLine();
		
		Human me = new Human(hair, eyes, skin);
		
		System.out.println("My info...");
		System.out.println("Hair: " + me.getHair());
		System.out.println("Eyes: " + me.getEyes());
		System.out.println("Skin: " + me.getSkin());
		
		me.setHES("Brown", "Brown", "Skin colored");
		
		System.out.println("\nFriend's info...");
		System.out.println("Hair: " + me.getHair());
		System.out.println("Eyes: " + me.getEyes());
		System.out.println("Skin: " + me.getSkin());
	}	
}
