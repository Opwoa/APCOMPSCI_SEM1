public class Song {
	public static void main(String[]args) {
		sing(4, "Na");
		sing(4, "Na");
		sing(3, "Hey");
		sing(1, "Goodbye!");
	}
	
	public static void sing(int reps, String word) {
		for (int i = 0; i < reps; i++) {
			System.out.print(word + " ");
		}
		System.out.println();
	}
}