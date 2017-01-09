import java.util.Random;
import java.util.Scanner;

public class Divisor {
	public static void main(String[]args) {
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		int[][] nums = new int[4][4];
		
		for(int i = 0; i < nums.length; i++) {				//fill double scripted array
			for(int j = 0; j < nums[i].length; j++) {
				nums[i][j] = rand.nextInt(100) + 1;
				System.out.printf("%-3d ", nums[i][j]);		//print double scripted array
			}
			System.out.println();
		}
		
		System.out.println("Enter a number:");
		int divisor = keyboard.nextInt();
		
		int count = 0;
		for(int i = 0; i < nums.length; i++) {				//search double scripted array
			for(int j = 0; j < nums[i].length; j++) {
				if(nums[i][j] % divisor == 0) {
					count++;
				}
			}
		}
		System.out.print("There are " + count + " numbers divisible by "
							+ divisor + " in the Array.");
	}
}