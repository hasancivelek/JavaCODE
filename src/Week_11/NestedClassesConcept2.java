package Week_11;
class OuterClass1{
	
	int x=10;
	
	class InnerClass{
		
		int y =5;
		
		void print() {
			System.out.println(x);
		}
	}
	void print() {
		InnerClass obj=new InnerClass();
		System.out.println(obj.y);
	}
}



public class NestedClassesConcept2 {

	public static void main(String[] args) {
		OuterClass1 myOuterClass1=new OuterClass1();
		
		OuterClass1.InnerClass myInnerClass=myOuterClass1.new InnerClass();
		myInnerClass.print();
		

	}

}
