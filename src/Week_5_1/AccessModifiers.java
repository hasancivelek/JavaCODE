//in this example , we demonstrate how to call methods from different classes
package Week_5_1;
//AccessModifiers.java is a source file

//we can call methods methods from another classes or packages in our project
//in order to call some other classes non- static methods ,you need to create object for that
public class AccessModifiers {

	
	public static void main(String[] args) {
		

		StaticMethods obj= new StaticMethods();
		obj.palindrome("bob");

	}

}


	

