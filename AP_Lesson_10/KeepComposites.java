import java.util.Arrays;
import java.util.ArrayList;

public class KeepComposites {
	public static void main(String[]args) {
		Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(numbers));
		
		removePrimes(nums);
		
		System.out.println(nums);
	}
	
	public static boolean gfactor(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return true;
			}
		}
		return false;
	}
	
	public static void removePrimes(ArrayList<Integer> numsList) {
		for (int i = 0; i < numsList.size(); i++) {
			if (!gfactor(numsList.get(i))) {
				numsList.remove(i);
				i--;
			}
		}
	}
}