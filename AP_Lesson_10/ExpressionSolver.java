import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ExpressionSolver {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter an equation:");
		String equationStr = keyboard.nextLine();
		String[] equationArr = equationStr.split(" ");
		ArrayList<String> equation = new ArrayList<String>(Arrays.asList(equationArr));
		
		doEquation(equation);
		System.out.println(equation);
	}
	
	public static void doEquation(ArrayList<String> equation) {
		int i = 0;
		while(i < equation.size() - 1) {
			if(equation.get(i).equals("*") || equation.get(i).equals("/")) {
				if(equation.get(i).equals("*")) {
					equation.set(i, Integer.toString(Integer.parseInt(equation.get(i - 1)) *
													  Integer.parseInt(equation.get(i + 1))));
				} else {
					equation.set(i, Integer.toString(Integer.parseInt(equation.get(i - 1)) /
													  Integer.parseInt(equation.get(i + 1))));
				}
				equation.remove(i - 1);
				equation.remove(i);
			} else {
				i++;
			}
		}
		
		i = 0;
		while(i < equation.size() - 1) {
			if(equation.get(i).equals("+") || equation.get(i).equals("-")) {
				if(equation.get(i).equals("+")) {
					equation.set(i, Integer.toString(Integer.parseInt(equation.get(i - 1)) +
													  Integer.parseInt(equation.get(i + 1))));
				} else {
					equation.set(i, Integer.toString(Integer.parseInt(equation.get(i - 1)) -
													  Integer.parseInt(equation.get(i + 1))));
				}
				equation.remove(i - 1);
				equation.remove(i);
			} else {
				i++;
			}
		}
	}
}