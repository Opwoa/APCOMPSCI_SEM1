import java.util.Scanner;

public class Excercise5_2 {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		keyboard.nextLine();

		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price3 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Please enter item 4:");
		String item4 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price4 = keyboard.nextDouble();
		keyboard.nextLine();
		
		double subTotal = price1 + price2 + price3 + price4;
		
		double discountAmnt = discount(subTotal);
		
		double tax = subTotal * .07;
		
		double total = subTotal + tax - discountAmnt;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		System.out.print("*                                       *\n");
		System.out.print("*                                       *\n");
		format("Sub Total:", subTotal);
		format("Discount:", discountAmnt);
		format("Tax:", tax);
		format("Total:", total);	
		System.out.println("_________________________________________\n      * Thank you for your support *");		
	}
	
	public static double discount(double amount) {
		if (amount >= 2000) {
			return (15 * amount) / 100;
		} else {
			return 0.0;
		}
	}
	
	public static void format(String word, double number) {
		System.out.printf("* %17s .........%10.2f *\n", word, number);
	}
}