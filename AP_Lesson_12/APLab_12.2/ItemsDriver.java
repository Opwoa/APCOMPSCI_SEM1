import java.util.Scanner;

public class ItemsDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Items item1;
		
		System.out.println("Enter Manufacturer:");
		String manufacturer = keyboard.nextLine();
		System.out.println("Enter Item Name:");
		String name = keyboard.nextLine();
		
		System.out.println("Are you entering category and price? (y or n)");
		if ("y".equals(keyboard.next())) {
			System.out.println("Enter Category:");
			String category = keyboard.next();
			System.out.println("Enter Price:");
			double price = keyboard.nextDouble();
			item1 = new Items(manufacturer, name, category, price);
		} else {
			item1 = new Items(manufacturer, name);
		}
		
		System.out.println(item1);
	}
}
