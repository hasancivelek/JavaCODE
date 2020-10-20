package Week_7_Recap;
//This example demonstrates overriding and overloading
class Test{
	
	void method1() {
		System.out.println("This is Test Class");
	}
	void method1(int a) {
		System.out.println("method int");
	}
}

public class Example2 extends Test{

	

@Override

void method1() {
	System.out.println("This is Example2 Class ");
	super.method1(9);
	super.method1();
}
	
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		
		example2.method1();
		
	}

}
