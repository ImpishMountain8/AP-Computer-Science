
public class AbstractTester {

	public static void main(String[] args) {
		//AbstractEmployee Sam = new AbstractEmployee();
		PublicEmployee r = new PublicEmployee("Rich", 25000);
		AbstractEmployee s = new PublicEmployee("Bob", 5000);
		s.getPaid();
		
	}

}
