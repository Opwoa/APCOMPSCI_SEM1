import java.util.Scanner;

public class MPHRunner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter distance:");
		int distance = keyboard.nextInt();
		System.out.println("Enter hours:");
		int hours = keyboard.nextInt();
		System.out.println("Enter minutes:");
		int minutes = keyboard.nextInt();
		
		MilesPerHour mph = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours 
							+ " hours and " + minutes + " minutes = "
							+ mph.getMPH() + " mph");
		
		mph.setValues(30, 1, 0);
		
		System.out.println("30 miles in 1 hour and 0 minutes = "
							+ mph.getMPH() + " mph");
	}

}
