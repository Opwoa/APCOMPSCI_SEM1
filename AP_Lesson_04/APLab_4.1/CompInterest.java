import java.util.Scanner;

public class CompInterest {
	public static void main(String[]args) {
		CompInterest interest = new CompInterest();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your interest rate?");
		double rate = keyboard.nextDouble();
		System.out.println("How much do you intend to borrow?");
		double principle = keyboard.nextDouble();
		System.out.println("How many times is the loan compounded per year?");
		double number = keyboard.nextInt();
		System.out.println("In how many years will you pay off this loan?");
		double time = keyboard.nextInt();

		double totalCost = interest.calcInterest(rate, principle, number, time);
		System.out.printf("Your total monthly payment is $%-5.2f\n", interest.monthPay(totalCost, time));
	}
	
	public double calcInterest(double r, double p, double n, double t) {
		double base = (1 + (r / n));
		double exponent = n * t;
		return p * Math.pow(base, exponent);
	}
	
	public double monthPay(double total, double t) {
		return total / (t * 12);
	}
}