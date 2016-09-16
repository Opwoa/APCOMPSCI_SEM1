import java.util.Scanner;

public class IDCard {
	public static void main(String[]args) {
		IDCard form = new IDCard();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = keyboard.nextLine();
		
		System.out.println("Enter your last name:");
		String lastName = keyboard.nextLine();

		System.out.println("Enter your title:");
		String title = keyboard.nextLine();

		System.out.println("Enter the school site:");
		String schoolSite = keyboard.nextLine();

		System.out.println("Enter the school year:");
		String schoolYear = keyboard.nextLine();

		System.out.println("What is your subject?");
		String subject = keyboard.nextLine();
		
		System.out.println("***********************************");
		form.format(schoolSite, schoolYear);
		form.format(firstName, lastName);
		form.format(title, subject);	
		System.out.println("***********************************");		
	}
	
	public void format(String word, String number) {
		System.out.printf("* %13s%18s *\n", word, number);
	}
}