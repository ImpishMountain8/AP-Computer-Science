
public class PublicEmployee extends AbstractEmployee{
	
	public PublicEmployee(String name, double salary){
		
	}
	
	public String chgName(String a){
		name = a;
		return a;
	}
	
	public void PrintName(){
		System.out.println(name);
	}
	
	public void getPaid(){
		System.out.println("You made money.");
	}
}
