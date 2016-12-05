import java.util.Scanner;
import java.util.Random;

public class BiggestNumber {
	public static int[] numbers = new int[10];

	public static void main(String[]args) {		
		fillArray();
		
		System.out.print("For the following numbers:");
		printArray();
		System.out.println("\nThe biggest number is " + getBiggest() + "." );
	}
	
	public static void fillArray() {
		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
	}
	
	public static void printArray() {
		for (int num : numbers) {
			System.out.print(" " + num);
		}
	}
	
	public static int getBiggest() {
		int max = 0;
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}