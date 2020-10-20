package Week_7;


class SuperClass1{
	int x;
	String y;
	public SuperClass1(int x, String y) {
		//super();
		System.out.println("i am in Superclass constructor");
		this.x = x;
		System.out.println("i set field x");
		this.y = y;
		System.out.println("i set field y");
		System.out.println("i am going to out of superclass constructor");
	}
	
}

class SubClass1 extends SuperClass1{
int a;
	public SubClass1(int x, String y,int a) {
		super(x, y);//this needs to be first statement
		System.out.println("i am in Subclass constructor");
		this.a=a;
		System.out.println("i set field a");
		System.out.println("This is the end of Subclaass Constructor");
		
	}
	
	
	
}

public class InheritanceConcept4 {

	public static void main(String[] args) {
		
//SubClass1 object1= new SubClass1(9, "Java",8);
//System.out.println(object1.y);
		SuperClass1 object2=new SuperClass1(9, "Java");

	}

}
