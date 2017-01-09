import java.util.Scanner;

public class GameGun {
	public static int bulletCount;
	public static int clipSize = 16;
	public static int shotCount;
	public static String[] clip;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clip = new String[clipSize];
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0) {
			System.out.println("Action:");
			String action = keyboard.next();
			if(action.equals("R")) {
				reload();
			} else if(action.equals("S")) {
				System.out.println(shoot());
			} else {
				System.out.println("Invalid Action");
			}
			printClip();
		}
		System.out.println("Out of Bullets!");
	}
	
	public static void resetClip() {
		for(int i = 0; i < clip.length; i++) {
			clip[i] = "[] ";
		}
	}
	
	public static String shoot() {
		if (shotCount > 0) {
			clip[shotCount - 1] = "[] ";
			shotCount--;
			return "\b\b\npew.\n";
		} else {
			return "\b\b\nReload? idk its up to you.\n";
		}
	}
	
	public static void reload() {
		if(bulletCount >= clipSize) {
			bulletCount -= clipSize;
			shotCount = clipSize;
		} else {
			shotCount = bulletCount;
			bulletCount = 0;
		}
		
		resetClip();
		for(int i = 0; i < shotCount; i++) {
			clip[i] = " * ";
		}
	}
	
	public static void printClip() {
		String output = "Bullets:\t" + bulletCount + "\nClip:\t";
		for(int i = 0; i < clip.length; i++) {
			output = output.concat(clip[i]);
		}
		System.out.println(output + "\n");
	}
}