import java.util.Scanner;

public class bank {

	int place = 0;
	Scanner scan = new Scanner(System.in);
	int numBankAccounts;
	bankAccount[] clients = new bankAccount[5];
	int choice;
	int choice1;
	String input;

	public void openBank() {
		choice = scan.nextInt();
		scan.nextLine();
		if (choice == 1) {
			login();
		} else if (choice == 2) {
			openAccount();
		} else if (choice == 3) {
			displayAllAccounts();
		} else if (choice == 4) {
			System.out.println("Have a fantabulous day!");
			exit();
		} else {
			menu();
		}
	}

	public void menu() {
		System.out.println("Please choose an option." + "\n1. Login" + "\n2. Create Account"
				+ "\n3. Display All Accounts" + "\n4. Exit");
		openBank();
	}

	public void login() {
		System.out.println("Please enter your name.");
		input = scan.nextLine();
		if (clients[place] == null) {
			System.out.println("There are no accounts created. Please create an account first.");
			menu();
		} else {
			for (; place < clients.length; place++) {
				if (clients[place] != null && clients[place].getName().equals(input)) {
					System.out.println("Welcome " + input + "!");
					menuAccount(place);
					break;
				}else if (!clients[place].getName().equals(input)) {
					System.out.println("We don't recognize that account name. Please try again.");
					menu();
				} else {
					continue;
				
				}
			}
		}
	}

	public void menuAccount(int place) {
		this.place = place;
		System.out.println("Please choose a given option." + "\n1. Deposit" + "\n2. Withdraw" + "\n3. Close Account"
				+ "\n4. Log out");
		choice1 = scan.nextInt();
		scan.nextLine();
		if (choice1 == 1) {
			deposit(place);
		} else if (choice1 == 2) {
			withdraw(place);
		} else if (choice1 == 3) {
			closeAccount(place);
		} else if (choice1 == 4) {
			logOut();
		}
	}

	public void openAccount() {
		System.out.println("Please enter your name.");
		input = scan.nextLine();
		if (numBankAccounts == 5) {
			System.out.println("We cannot create an account for you at this time.");
			menu();
		} else {
			clients[numBankAccounts] = new bankAccount(input, 0);
			numBankAccounts++;
			menu();
		}
	}

	public void closeAccount(int place) {
		clients[place] = null;
		System.out.println("Your account has been successfully terminated.");
		numBankAccounts--;
		menu();
	}

	public void deposit(int place) {
		System.out.println("How much would you like to deposit?");
		double amount = scan.nextDouble();
		scan.nextLine();
		clients[place].setBalance(clients[place].getBalance() + amount);
		System.out.println("Your account now has " + clients[place].getBalance() + " dollars.");
		menuAccount(place);
	}

	public void withdraw(int place) {
		System.out.println("How much would you like to withdraw?");
		double amount = scan.nextDouble();
		scan.nextLine();
		if (clients[place].getBalance() < amount) {
			// System.out.println("You do not have enough money to make this
			// withdrawl.");
			clients[place].setBalance(clients[place].getBalance() - amount);
			System.out.println("If you were to make this withdrawl you would have -("
					+ Math.abs(clients[place].getBalance()) + ") dollars.");
			clients[place].setBalance(clients[place].getBalance() + amount);
		} else {
			clients[place].setBalance(clients[place].getBalance() - amount);
			System.out.println("Your account now has " + clients[place].getBalance() + " dollars.");
		}
		menuAccount(place);
	}

	public void logOut() {
		System.out.println("Have a good day!");
		menu();
	}

	public void exit() {

	}

	public void displayAllAccounts() {
		for (bankAccount x : clients) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		bank myBank = new bank();
		myBank.menu();
	}

}