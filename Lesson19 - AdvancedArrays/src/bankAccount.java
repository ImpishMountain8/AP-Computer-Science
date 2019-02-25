
public class bankAccount {
	private String name;
	private double balance;

	public bankAccount() {

	}

	public bankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public double deposit(double x) {

		balance += x;
		return balance;
	}

	public double withdraw(double x) {

		balance -= x;
		return balance;
	}

	public String toString() {
		return "Name: " + name + "\nBalance: " + balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
}
