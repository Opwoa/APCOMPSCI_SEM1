import java.util.Scanner;
import java.util.Random;

public class GetOdds {
	public static void main(String[]args) {
		int[] numbers = new int[10];
		
		numbers = fillArray(numbers);
		
		System.out.print("For the following numbers:");
		printArray(numbers);
		System.out.println("\n" + getOdds(numbers) + " are odd." );
	}
	
	public static int[] fillArray(int[] numbersArrayInsideMyMethodRightHere) {
		Random rand = new Random();
		for (int i = 0; i < numbersArrayInsideMyMethodRightHere.length; i++) {
			numbersArrayInsideMyMethodRightHere[i] = rand.nextInt(100);
		}
		return numbersArrayInsideMyMethodRightHere;
	}
	
	public static void printArray(int[] numbersArrayInsideMyMethodRightHere) {
		for (int num : numbersArrayInsideMyMethodRightHere) {
			System.out.print(" " + num);
		}
	}
	
	public static int getOdds(int[] numbersArrayInsideMyMethodRightHere) {
		int odds = 0;
		for (int num : numbersArrayInsideMyMethodRightHere) {
			if (!(num % 2 == 0)) {
				odds++;
			}
		}
		return odds;
	}
}