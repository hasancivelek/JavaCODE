package Week_11_Recap;

//create a class inside a class(Nested class)
//create a class inside a method(Local class)
//create a class inside a statement (Anonymous class)

class OuterName{
	private int a=9;
	
	
	private class InnerClass{
	
		private	int b=999;
		void method() {
			System.out.println(a);
		}
		
	}
	
	void outerMethod() {
		InnerClass innerClass=new InnerClass();
		System.out.println(innerClass.b);
		innerClass.method();
	}
}





public class NestedClassConcept {

	public static void main(String[] args) {
	//create an object for inner class	

		OuterName outername = new OuterName();
		
		//OuterName.InnerClass innerClassObject = outername.new InnerClass();
		
		//innerClassObject.method();
		
		outername.outerMethod();
	}

}
