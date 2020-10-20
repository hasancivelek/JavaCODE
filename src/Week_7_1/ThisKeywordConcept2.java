package Week_7_1;
//This example demonstrates this keyword as argument
class Example1{
	
	int number=10;
	
	void method1(Example1 ref) {
		System.out.println("Method has been called");
		System.out.println(ref.number);
	}
	
	void method2() {
		//Example1 object = new Example1();
		//method1(object);
		//using this keyword as an argument
		method1(this);
	}
}


public class ThisKeywordConcept2 {

	public static void main(String[] args) {
		
Example1 object = new Example1();
object.method2();
object.method1(object);

	}

}
