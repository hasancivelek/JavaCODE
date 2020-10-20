package Week_6;

public class ClassConcept {
	
	int number;
	String word;
	
	public ClassConcept() {
		System.out.println("you used no parameter constructor");
	}
public ClassConcept(int number,String word) {
	
	this.number=number;
	this.word= word;
	
	System.out.println("you used 2 parameter constructor");
}

	public static void main(String[] args) {
		
ClassConcept obj = new ClassConcept(4,"hasan");

System.out.println(obj.number +" " + obj.word);


ClassConcept obj1 = new ClassConcept();
obj1.number=2;
obj1.word="hello";
System.out.println(obj1.number+" "+obj1.word);

	}

}
