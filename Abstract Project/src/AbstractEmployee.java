
public abstract class AbstractEmployee {
	String name;
	double salary;
	
	public double setSalary(double s){
		salary += s;
		return salary;
	}
	
	public abstract String chgName(String name);
}
