package Week_5_1;

public class AccessModifiers1 {

	public static void main(String[] args) {
		
		SecondClass secondClass = new SecondClass();
		secondClass.method1();
		//if my static method in the different class , we need to use classname.method()

		SecondClass.method2();
		//SecondClass.method3();//compiler error , private method
	}

}
/*
 * public:  public methods are accessible from anywhere in the project
 * Default: Default methods are accessible from only the same package
 * private: Private methods are accessible from only the same class
 */

class SecondClass{
	void method1() {//Access Modifier:Default
		//non- static method :when we want to call this method , we need to create object
		
		System.out.println("this is method 1");
	}
	
	static void method2() {//Access modifier : default
		//static method:in order to call this method from another class , we need to use the class name
		System.out.println("this is method 2");
		
	}
	private static void method3() {//Access modifier is private
		System.out.println("this is method 3");
	}
	public static void method4() {//Access modifier is public
		System.out.println("this is method 4");
	}
	
	
}