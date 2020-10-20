package Week_6;
//this example demonstrates 3 ways to initialize objects.
//with method , directly accessing the fields and constructors.
public class InitializingObject {

	String aString;
	int aInt;
	
	void method(String a, int b) {
		aString=a;
		aInt=b;
	}
	
	public InitializingObject(String aString, int aInt) {
		
		this.aString = aString;
		this.aInt = aInt;
	}
	
	public InitializingObject() {
		

	}

	public static void main(String[] args) {
	//Initializing the object with using a method	
InitializingObject object1 = new InitializingObject();

object1.method("Java", 8);

System.out.println(object1.aString+" "+object1.aInt);

//Initializing the object with using a constructor.

InitializingObject object2 = new InitializingObject("Java",11);

System.out.println(object2.aString+" "+object2.aInt);

//Initializing the object with directly accessing fields 

InitializingObject object3 = new InitializingObject();

object3.aString="Java";
object3.aInt=12;

System.out.println(object3.aString+" "+object3.aInt);


	}

}
