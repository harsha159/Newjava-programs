package java123;

public class Construtors {
	
	int age;
	String name;
	
	Construtors(String name ,int age){
		
		System.out.println(name);
		
		System.out.println(age);
	}
Construtors(int age,String name){
		
		System.out.println(age);
		System.out.println(name);
		
}
	
	

	public static void main(String[] args) {
		
		
		
		Construtors add=new Construtors("harsha",20);
		Construtors add1=new Construtors(20,"harsha");
	
		
		
		
		
	}

}
