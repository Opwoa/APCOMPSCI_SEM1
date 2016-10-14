import java.util.Scanner;

public class Password {
	static String username = null;
	static String password = null;
	static int counter = 0;
	
	public static void main(String[]args) {
		username = "TremendousDuckDinosaur";//username and password credited to tumblr.com's
		password = "DeepTrashCupcake";		//randomly generated username suggestions
		System.out.println(username + "\n" + password);
		passCheck();
	}
	
	public static void passCheck() {
		counter ++;
		if (counter > 3) {
			System.out.println("Go. Away.");
			return;
		}
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter your username:");
		String userInput = keyboard.nextLine();
		System.out.println("Please enter your password:");
		String passInput = keyboard.nextLine();
		
		if (userInput.equals(username)|| passInput.equals(password)) {
			if (!userInput.equals(username)) {
				System.out.println("Your username is incorrect!");
				passCheck();
			} else if (!passInput.equals(password)) {
				System.out.println("Your password is incorrect!");
				passCheck();
			} else {
				System.out.println("You are granted access!");
			}
		} else {
			System.out.println("Wow. You didn't get either right. Why are you even here.");
			passCheck();
		}
	}
}