package Week_9;



//this example demonstrates static and default in interface
interface IInterface2{

	//Not all the methods needs to be abstract in interface (After Java 8)	
	
	static void method1() {
	
		System.out.println("Static method in Interface2");
		
	}
	default void method2() {
		
		System.out.println("This is the default method");
	}
	
}

public class InterfaceConcept5 implements IInterface2 {

	public static void main(String[] args) {
		
		IInterface2.method1();
		
		IInterface2 object = new InterfaceConcept5();
		
		object.method2();

	}

}
