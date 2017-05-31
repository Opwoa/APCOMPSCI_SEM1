import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2_2 maggie = new Magpie2_2();
		
		System.out.println (maggie.getResponse(" "));
		System.out.println(maggie.getResponse("I know not no."));
		System.out.println (maggie.getResponse("My dog died."));
		System.out.println(maggie.getResponse("My Father is lazy."));
		System.out.println(maggie.getResponse("I want to sleep."));
		System.out.println(maggie.getResponse("I hate you."));
		System.out.println(maggie.getResponse("You love me."));
		/*
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}*/
	}

}
