package Week_6_1;

public class StaticExample {

	static int numberOfObject;
	
public StaticExample() {
		numberOfObject++;
	System.out.println("constructor has been used");
	
}
	
	
	
	public static void main(String[] args) {
//create a program which counts the number of object that has been created
new StaticExample();
new StaticExample();

System.out.println(StaticExample.numberOfObject);

//what happens when we create an object?
//when we create object , we are using constructor.
	}

}
