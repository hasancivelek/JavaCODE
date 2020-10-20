package Week_5;
//methods needs to be created inside of the class.
//we can not created a method inside of an another method.
//Non-void methods needs to have return keywords
public class NonVoidMethods1 {
	//return value needs match with method return type
	
	double doubleMethod(byte a ,String name) {
		System.out.println( name + a);
		
		return 5.0;
		
	}
	
	int addition(int a, int b) {
		
		return a+b; //int values
	}
	
	String printout(String string) {
		return string +"!";
	}

	public static void main(String[] args) {
		
NonVoidMethods1 object= new NonVoidMethods1();

int calculation= object.addition(9, 8);
System.out.println(calculation);

System.out.println(object.addition(9, 8));

System.out.println(object.printout("I love Java"));

System.out.println(object.doubleMethod((byte)4, "hasan"));

	}

}
