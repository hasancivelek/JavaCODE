package Week_9;

interface IInterface {
	// abstract methods
	// global variables
	// no constructor
	// can not be instantiated
	// no concrete methods(default static private)
	//variables are final and static by default,and can not be private
int a=9;
	abstract void massage(); // abstract method abstract keyword is optional
}

 

interface IInterface1 {
	
	abstract void massage1();
}

class A implements IInterface, IInterface1 {

	@Override
	public void massage() {
		System.out.println("Message");

	}

	@Override
	public void massage1() {
		System.out.println("Massage1");

	}

}

public class InterfaceConcept1 {

}
