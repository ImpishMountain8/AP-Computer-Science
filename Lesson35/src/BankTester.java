
public class BankTester {

	public static void main(String[] args) {
		// 1-16-19 
		BankAccount b = new BankAccount(500);
		SavingsAccount s = new SavingsAccount(1000, 5);

//		System.out.println(b.getBalance());
//		System.out.println(s.getBalance());
//
//		b.deposit(500);
//		System.out.println("");
//		s.deposit(500);
//
//		System.out.println(b.getBalance());
//		System.out.println(s.getBalance());
//
//		// b.addInterest();
//		System.out.println("");
//		s.addInterest();
//
//		System.out.println(b);
//		System.out.println(s);
//
//		System.out.print(b);
		
		// 1-17-19
		BankAccount hybrid = new SavingsAccount(500, 4);
		//hybrid.addInterest();
		s.deposit(500);
		System.out.println(s.getBalance());
		System.out.println(s.superGetBalance());
		
	}

}
