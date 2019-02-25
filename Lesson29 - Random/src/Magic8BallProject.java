import java.util.Random;
import java.util.Scanner;

public class Magic8BallProject {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.println("Question:");

		String ques = scn.nextLine();
		
		
		int choice = 1 + r.nextInt(10);
		String response = "";

		if (choice == 1) {
			response = "It is certain";
		} else if (choice == 2) {
			response = "It is decidedly so";
		} else if (choice == 3) {
			response = "Without a doubt";
		} else if (choice == 4) {
			response = "Yes - definitely";
		} else if (choice == 5) {
			response = "You may rely on it";
		} else if (choice == 6) {
			response = "As I see it, yes";
		} else if (choice == 7) {
			response = "Most likely";
		} else if (choice == 8) {
			response = "Outlook good";
		} else if (choice == 9) {
			response = "Yes";
		} else if (choice == 10) {
			response = "Signs point to yes";
		}		
		
		System.out.println("The Magic 8 Ball says: " + response);
	}
}
