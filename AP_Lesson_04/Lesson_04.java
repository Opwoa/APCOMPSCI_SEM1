import java.util.Scanner;

public class Lesson_04 {
	public static void main(String[]args) {
		Lesson_04 form = new Lesson_04();
		
		System.out.printf("%10s  %10.2f\n", "test", 256.3456);
		String word1 = "blaah";
		double number1 = 256.3456;
		
		form.format(word1, number1);
		
		String word2 = "yes";
		double number2 = 234.5467;
		form.format(word2, number2);
	}
	
	public void format(String word, double number) {
		System.out.printf("%10s  %10.2f\n", word, number);
	}
}