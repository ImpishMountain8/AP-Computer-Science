import java.util.Scanner;

public class newMath implements interMath {

	public double mod(double x, double y) {
		while (x > y) {
			x = x - y;
		}

		return x;
	}

	public double pow(double x, int y) {
		double z = 1;
		int i;
		for (i = 0; i < y; i++) {
			z = z * x;

		}
		return z;
	}

	public double findHypotnuse(double a, double b) {
		return Math.sqrt(a * a + b * b);
	}

	public double quadraticPlus(double a, double b, double c) {
		double z = (-b + Math.sqrt((b * b) - (4 * a * c))) / a * 2;
		return z;
	}
	
	public double quadraticMinus(double a, double b, double c){
		double y = (-b - Math.sqrt((b * b) - (4 * a * c))) / a * 2;
		return y;
	}
	
	public double absoluteValue(double x){
		if(x < 0){
			x = x * -1;
		}
		return x;
	}
}
