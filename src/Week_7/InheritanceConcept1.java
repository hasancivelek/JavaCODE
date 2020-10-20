package Week_7;

//Subclass will inherit all the properties (except private properties ) from superclass
//inheritance only works in one way.Properties will be inherited from super class to subclass

//single inheritance
class SuperClass{
	private int x;
	String yString;
	
	 void SCMethod() {
		System.out.println("this is method in super class!");
	}
}

class SubClass extends SuperClass{
	int a;
	String b;
	void SUBMethod() {
		System.out.println("this is method in subclass!");
	}
	void SubMethod2() {
		System.out.println(a+"\n"+b+"\n"+yString);
		SCMethod();
	}
	
}




//public classes needs their own file

public class InheritanceConcept1 {
	
	public static void main (String[]args) {
		
		SubClass subClass = new SubClass();
		
		subClass.a=9;
		//subClass.x=10;// x is not reachable with subclass object
		
		SuperClass superClass = new SuperClass();
		//superClass.SUBMethod(); //SUBMethod is not reachable with superclass object.
		
		subClass.SubMethod2();
		
	}

}
