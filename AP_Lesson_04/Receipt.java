import java.util.Scanner;

public class Receipt {
	public static void main(String[]args) {
		Receipt form = new Receipt();
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
		
		String subTotStr = "Subtotal:";
		double subTotNum = price1 + price2 + price3;
		
		String taxStr = "Tax:";
		double taxNum = subTotNum * .07;
		
		String totalStr = "Total:";
		double totalNum = subTotNum + taxNum;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.print("\n\n");
		form.format(subTotStr, subTotNum);		
		form.format(taxStr, taxNum);
		form.format(totalStr, totalNum);	
		System.out.println("_________________________________________\n * Thank you for your support *");		
	}
	
	public void format(String word, double number) {
		System.out.printf("* %17s ........%10.2f\n", word, number);
	}
}