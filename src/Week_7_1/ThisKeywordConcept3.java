package Week_7_1;
class Example2{
	
	Example3 reference;
	
	public Example2(Example3 reference) {
		this.reference=reference;

	}
	void display() {
		System.out.println(reference.data);
	}
}
class Example3 {
	int data= 10;
	
	public Example3() {
		Example2 object=new Example2(this);
		object.display();
		
	}
}
public class ThisKeywordConcept3 {

	public static void main(String[] args) {
		
Example3 example3 = new Example3();

	}

}
