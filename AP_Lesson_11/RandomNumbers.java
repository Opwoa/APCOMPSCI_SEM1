import java.util.Random;

public class RandomNumbers {
	public static void main(String[]args) {
		Random rand = new Random();
		int[][] nums = new int[4][4];
		
		for(int i = 0; i < nums.length; i++) {				//fill double scripted array with
			for(int j = 0; j < nums[i].length; j++) {		//random numbers
				nums[i][j] = rand.nextInt(100);
			}
		}
		
		for(int i = 0; i < nums.length; i++) {				//print double scripted array
			for(int j = 0; j < nums[i].length; j++) {
				System.out.printf("%-2d ", nums[i][j]);			//printf to format for one
			}													//digit numbers
			System.out.println();
		}
	}
}