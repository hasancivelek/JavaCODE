package Week_8_Recap;

public abstract class Person {
	//abstract method
	public abstract void speak();
	
	//concrete method
	public void healtInsurance() {
		System.out.println("if the position is full time , you have healt insurance ");
	}

}
abstract class Employee extends Person{
	//Abstract classes doesn't have to overriden abstract methods in superclass
}

class Contract extends Employee{

	@Override
	public void speak() {
		System.out.println("The position is contract");
		
	}
	public void benefits() {
		System.out.println("Salary is good , but benefit is not good in contract");
		
	}
	
}
class FTEmployee extends Employee{

	@Override
	public void speak() {
		
System.out.println("The position is fulltime");
		
	}
	public void benefits() {
		System.out.println("Benefits are good , but salary is less than  in contract");
	}
	
}

