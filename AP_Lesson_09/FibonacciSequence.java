import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your starting number:");
		int numberAtWhichThisSequenceShallStartAt = keyboard.nextInt();
		
		System.out.println("Enter your sequence size:");
		int howManyTimesThisSequenceShallRun = keyboard.nextInt();
		
		int[] seq = new int[howManyTimesThisSequenceShallRun];
		
		for (int i = 0;i < howManyTimesThisSequenceShallRun; i++) {
			if (i == 1 || i == 0) {
				seq[i] = numberAtWhichThisSequenceShallStartAt;
			} else {
				seq[i] = seq[i - 1] + seq[i - 2];
			}
			System.out.print(seq[i] + " ");
		}
		
	}
}