package Week_8;



public class MyClass {
	//attributes - global variable- instance variable
	int x;
	String y;
	//Constructor:speaical block -method which we can initialize -- instantiating object.
	//if we don't declare constructor , java provides no-parameter constructor.
	
	public MyClass(int x, String y) {
		this.x=x;
		this.y=y;
		System.out.println("two parameter constructor has been triggered");

	}
	public MyClass() {
		
		System.out.println("No parameter constructor has been triggered");
	}
	
	
	
	public static void main (String[] args) {
		MyClass object1= new MyClass(9, "String");
		MyClass object2= new MyClass(99, "String buffer");
		MyClass object3= new MyClass();
		
		
	}

}
