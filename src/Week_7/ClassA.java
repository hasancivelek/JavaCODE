package Week_7;

class ClassB{//super Class -Base Class-parent Class
	String bString;
	int bNumber;
	
	void methodB() {
		System.out.println("this is Class B method");
	}
}


public class ClassA extends ClassB {//child class- sub class
	
	String AString;
	int ANumber;
	
	void method() {
		System.out.println("this is a Class A method");
	}
	
	public static void main (String[]args) {
		
		ClassA Aobject= new ClassA();
		Aobject.AString="Field in Class A";
		Aobject.ANumber=7;
		Aobject.method();
		
		Aobject.methodB();
		
		
	}

	}

