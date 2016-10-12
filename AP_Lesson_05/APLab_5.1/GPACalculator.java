import java.util.Scanner;

public class GPACalculator {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
/*1*/	System.out.println("Enter your letter grade for Science:");
		String science = keyboard.nextLine();

/*2*/	System.out.println("Enter your letter grade for Math:");
		String math = keyboard.nextLine();

/*3*/	System.out.println("Enter your letter grade for History:");
		String history = keyboard.nextLine();

/*4*/	System.out.println("Enter your letter grade for English:");
		String english = keyboard.nextLine();

/*5*/	System.out.println("Enter your letter grade for Elective1:");
		String electiveOne = keyboard.nextLine();

/*6*/	System.out.println("Enter your letter grade for Elective2:");
		String electiveTwo = keyboard.nextLine();

/*7*/	System.out.println("Enter your letter grade for Elective3:");
		String electiveThree = keyboard.nextLine();
		
		double gPoints = calcPoints(science) + calcPoints(math) + calcPoints(history) + calcPoints(english) + calcPoints(electiveOne) + calcPoints(electiveTwo) + calcPoints(electiveThree);

		System.out.printf("Your GPA is %.3f\n", gPoints / 7);
	}
	
	public static double calcPoints(String tempGrade) {
		String grade = tempGrade.toUpperCase();
		if (grade.equals("A")) {
			return 4.0;
		}
		if (grade.equals("B")) {
			return 3.0;
		}
		if (grade.equals("C")) {
			return 2.0;
		}
		if (grade.equals("D")) {
			return 1.0;
		} else {
			return 0.0;
		}
	}
}