package Week_8_1;

//Abstract Classes
abstract class SuperClas {
	int a;
	// 1)we can create method without body (with abstract keyword)
	// 2) we can not instantiate abstract classes.
	// 3) Abstract classes can have 0 or more abstract methods
	// 4)Abstract classes can have concrete methods.

	// Abstract method
	abstract void add();

	abstract void display();

	void concreteMethod() {
		System.out.println("Concrete Method");
	}

	// Abstract classes can have constructor
	public SuperClas() {
	}

}

class SubClass extends SuperClas {//class one abstract yazarakta hata giderile bilir. 
//	//we need to override abstract methods in the superclass
	@Override
	void add() {
		System.out.println("Subclass overriden add() ");
	}

	@Override
	void display() {

		System.out.println("Subclass overriden display() ");

	}

}

//Concrete Classe
public class AbstractConcept1 {

	// concrete method
	public static void main(String[] args) {
		// SuperClas objet1=new SuperClas() ;//Abstract classes object olusturamazsin.

	}

}
