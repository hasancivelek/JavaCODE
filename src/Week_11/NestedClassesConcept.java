package Week_11;
//Inner- Nested Class
class OuterClass{
	int num;
	
	private class InnerClass{
		void print() {
			System.out.println("This is inner class");
		}
	}
	void displayInner() {
		InnerClass innerClass= new InnerClass();
		innerClass.print();
	}
}


public class NestedClassesConcept {
	
	

	public static void main(String[] args) {
		OuterClass outerClass= new OuterClass();
		outerClass.displayInner();

	}

}
