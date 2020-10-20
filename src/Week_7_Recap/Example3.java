package Week_7_Recap;
//This and super keyword for invoking constructor
//if our superclass has constructor , one of the superclass constructor needs to be invoked when we are creating subclass object.
class Class1 {
	public Class1(int a) {

		System.out.println("int parameter constructor");
	}

	public Class1(double a) {
		this(9);// this statement invokes int parameter constructor
		System.out.println("double parameter constructor");

	}

}

public class Example3 extends Class1 {

	public Example3() {
		super(4.0); //// this statement invokes double parameter constructor

	}

	public static void main(String[] args) {
		new Example3();

	}

}
