package Week_5_1;

public class StaticMethods {

	public static void method1() {
		System.out.println("Method 1");
	}
	
	static void method2() {
		System.out.println("Method 2");
	}
	
	static void reverseString (String string) {
		for(int i= string.length()-1; i>=0; i--) {
			System.out.print(string.charAt(i));
		}
		
	}
	//create a method which finds out if a string is palindrome or not 
	//palindrome: bob, ana, robert(not palindrome)
	
	static void palindrome(String string) {
		String reversed="";
		for(int i= string.length()-1; i>=0; i--) {
			reversed+=string.charAt(i);
		}
    if(string.equalsIgnoreCase(reversed)) {
    	System.out.println("Palindrome");
    }
    else {
    	System.out.println("Not Palindrome");
    }

		}
		
	
	public static void main(String[] args) {
		//calling method
		method1();
		method2();
		// Method Signature: Method name and parameters
		reverseString("Silicone Labs");
		
		palindrome("Bob");


	}

}
