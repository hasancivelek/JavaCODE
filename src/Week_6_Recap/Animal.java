package Week_6_Recap;

public class Animal {
//properties 
	int legs;
	String type;
	
	// difference between method and constructor
	/*
	 * constructor                  method
	 * no return type              return type required
	 * initialize object           performing functionality of an object
	 * invoke implicitly           invoke explicitly
	 * same name with class         can be named as anything
	 * can not be Final
	 * 
	 */
	
	
	public Animal(int legs,String type) {
		this.legs=legs;
		this.type=type;

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
