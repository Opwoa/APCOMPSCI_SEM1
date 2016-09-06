public class Lab_02 {
	public static void main(String[]args) {
		multiplication();
		concatenation();
		compCalc();
	}
	
	public static void multiplication() {
		int x = 8;
		int y = 5;
		int prod = x * y;
		System.out.println(x + " multiplied by " + y + " = " + prod + "\n");
	}
	
	public static void concatenation() {
		String name = "Shawn Greay";
		int houseNum = 7607;
		String street = "Sycamore Street";
		String city = "Jacksonville";
		String state = "FL";
		int zip = 32219;

		System.out.println("Address:\n" + name + "\n" + houseNum + " " 
							+ street + "\n" + city + ", " + state + " " + zip + "\n");
	}
	
		public static void compCalc() {
		int l = 8;
		int w = 5;
		int h = 6;
		int surfArea = 2 * h * (l - w);
		System.out.println("The surface area of your rectangular prism is " + surfArea);
	}
}