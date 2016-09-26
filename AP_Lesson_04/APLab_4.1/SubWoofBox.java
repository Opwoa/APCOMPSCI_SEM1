import java.util.Scanner;

public class SubWoofBox {
	public static void main(String[]args) {
		SubWoofBox volume = new SubWoofBox();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the height in inches?");
		double height = keyboard.nextDouble();
		System.out.println("What is the width in inches?");
		double width = keyboard.nextDouble();
		System.out.println("What is the length in inches?");
		double length = keyboard.nextDouble();

		double vol = volume.calcVol(height, width, length);
		System.out.printf("The volume of your sumbwoofer is %-3.2f cubic feet.\n", vol);
	}
	
	public double calcVol(double h, double w, double l) {
		double volInch = h * w * h;
		double volFeet = volInch / 1728;
		return volFeet;
	}
}