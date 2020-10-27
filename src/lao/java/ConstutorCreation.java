package lao.java;

public class ConstutorCreation {

	Integer number;
	String name;
	// No Arugument Construtor
	// To wirte logic when object is created.
	ConstutorCreation() { 
		number = 1000;
		name = "Zebronics";
	}
	
	public static void main(String[] args) {
		
		ConstutorCreation obj = new ConstutorCreation();
		System.out.println(obj.number);
		System.out.println(obj.name);
	}
	
	
	
	
	
	
}
