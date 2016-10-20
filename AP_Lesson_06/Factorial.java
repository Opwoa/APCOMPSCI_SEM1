import java.util.Scanner;

public class Factorial {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("System.out.println(\"Your output is \" + factorial(");
		int repeatLoopOnlyUpToThisNumber = keyboard.nextInt();
		System.out.println("\b));");
		
		int factorial = 1;
		for (int i = 2; i < repeatLoopOnlyUpToThisNumber; i++) {
			factorial = factorial * i;
		}
		System.out.println("Your output is " + factorial);
	}
}