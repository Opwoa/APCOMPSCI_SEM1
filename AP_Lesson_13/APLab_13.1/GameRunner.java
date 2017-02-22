public class GameRunner {
	public static void main(String[] args) {
		PC myPC = new PC("PC");
		PlayStation myPlayStation = new PlayStation();
		XBox myXBox = new XBox();
		
		System.out.println(myPC);
		System.out.println(myPlayStation);
		System.out.println(myXBox);
	}	
}
