import java.util.Scanner;

public class GraphTable {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Slope of line: ");
		int slope = keyboard.nextInt();
		
		System.out.print("From 1 to ");
		int theOtherVariableIsTooNormal = keyboard.nextInt();
		
		System.out.println("\n   x|y");
		System.out.println("----|----");
		for (int i = 1; i <= theOtherVariableIsTooNormal; i++) {
			System.out.printf("%4d|%-4d\n", i, i * slope);
		}
	}
}