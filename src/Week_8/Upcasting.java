package Week_8;

//Upcasting : Creating superclass reference with subclass object.
class SuperClass {
	int superClassField;

	void superClassMethod() {
		System.out.println("super class Method");
	}

	void overridenMethod() {
		System.out.println("Overridin Method superclass ");
	}
}

class SubClass extends SuperClass {
	int subClassField;

	@Override
	void overridenMethod() {
		System.out.println("Overridin Method in SubClass");

	}

	void subClassMethod() {
		System.out.println("subclass Method");
	}

}

public class Upcasting {

	public static void main(String[] args) {
		
		//upcasting objects has access to super fields and method (expect overriden method). Overriden method coming from subclass.
		SuperClass object = new SubClass();
		object.superClassField=9;
		object.superClassMethod();//superclass Method
		object.overridenMethod();//overridin method in subClass
	//	object.subClassField;
		
		object = new SuperClass();//updating object SuperClass
		object.overridenMethod();

	}

}
