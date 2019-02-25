import java.util.Random;

public class TrueRandomProject {

	public static void main(String[] args) {
		int a1[] = new int[10];
		Random r = new Random();
		int x;
		int y = 0;
		
		for(x = 0; x < 10000; x++){
			a1[r.nextInt(10)]++;
		}
		for(y = 0; y < a1.length; y++){
			System.out.println("The number " + y + " appeared " + a1[y] + " times.");
	
		}
	}

}
