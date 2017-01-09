import java.util.Random;

public class XsAndOs {
	public static void main(String[]args) {
		Random rand = new Random();
		String[][] xAndO = new String[4][4];
		
		for(int i = 0; i < xAndO.length; i++) {				//fill double scripted array
			for(int j = 0; j < xAndO[i].length; j++) {
				int pick = rand.nextInt(2) + 1;
				if(pick == 1) {
					xAndO[i][j] = "X";
				} else {
					xAndO[i][j] = "O";
				}
				System.out.print(xAndO[i][j] + "\t");		//print double scripted array
			}
			System.out.println();
		}
	}
}