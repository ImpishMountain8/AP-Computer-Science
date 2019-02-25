
public class DistToLine {
	static double A;
	static double B;
	static double C;
	
	public static double getDist(double a, double b){
		double Dist = Math.abs(((A*a) + (B*b) + C) / Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2)));
		return Dist;
	}
}
