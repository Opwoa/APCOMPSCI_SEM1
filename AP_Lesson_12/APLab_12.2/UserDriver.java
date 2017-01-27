import java.util.Scanner;

public class UserDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstName = keyboard.nextLine();
		System.out.println("Enter Last Name:");
		String lastName = keyboard.nextLine();
		
		User user1;
		
		System.out.println("Would you like to use a public avatar? (y or n)");
		if ("y".equals(keyboard.next())) {
			System.out.println("Enter Avatar:");
			String avatar = keyboard.next();
			user1 = new User(firstName, lastName, avatar);
		} else {
			user1 = new User(firstName, lastName);
		}
		
		System.out.println(user1);
	}
}
