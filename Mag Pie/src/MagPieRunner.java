import java.util.Scanner;
public class MagPieRunner {

	public static void main(String[] args) {
		/**
		 * Create a Magpie, give it user input, and print its replies.
		 */
			Magpie5 maggie = new Magpie5();
			
			System.out.println (maggie.getGreeting());
			Scanner in = new Scanner (System.in);
			String statement = in.nextLine();
			
			
			
			while (!statement.toLowerCase().equals("bye"))
			{
				System.out.println (maggie.getResponse(statement.toLowerCase()));
				statement = in.nextLine();
			}

	}

}
