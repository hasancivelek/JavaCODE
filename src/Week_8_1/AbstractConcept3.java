package Week_8_1;
/*
 * -Can may abstract class needs to have only abstract methods?
 * +It can have both concrete or abstract methods.
 * 
 *  we can not use abstract keyword in our constructor
 *  
 *   - Can we instantiate a class which has no abstract method but declared with abstract keyword
 *   +No , we can not instantiate abstract classes
 *   
 *   -Can we declare abstract methods as private?
 *   +No, abstract methods can not be private
 *   
 *   -can we declare abstract methods as static?
 *   +Abstract classes can not be static.
 *   
 *   Abstract classes can have instance variable , concrete methods and constructor
 *   
 *   -if we can instantiate the abstract classes , why we have constructor?
 *   +because abstract classes can have subclass, in order to create an object for subclass we need to invoke super class 
 *   constructor (explicitly or implicitly)
 */

abstract class SuperClass1{
	public SuperClass1() {
		
System.out.println("SuperClass");
	}
}

public class AbstractConcept3 extends SuperClass1{
	
	public AbstractConcept3() {
	//	super();
System.out.println("AbstractConcept3 Class");
	}

	public static void main(String[] args) {
		
AbstractConcept3 object = new AbstractConcept3();

	}

}
