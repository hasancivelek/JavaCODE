package Week_5;

public class MethodConcept1 {

//Methods: methods are collection of statement which helps me to organize my class logic.	
	
//access modifier	
//  ^	access specifier
//  ^       ^   return type
//	^       ^      ^  method name 
//	^       ^      ^    ^     parameter
//	^       ^      ^    ^       ^
//	^       ^      ^    ^       ^
	public static void main(String[] args) {
		String string="hasan civelek";
		System.out.println(string.length());

 //    Classname   objectname=new Classname();		
		MethodConcept1 object= new MethodConcept1();
	//call printHellWord Method
		object.printHelloWord();
		object.printMultipleStrings();
		//              argument
		object.printNumber(7);
	}
	
	//minimum requirements:returnType methodname(){}
	void printHelloWord() {
		System.out.println("helllo word");
	}
	void printMultipleStrings() {
		for(int i=0; i<5; i++) {
			System.out.print("Java");
		}
		
	}
	void printNumber(int i) {
		for(int j=0; j<i;j++) {
			System.out.println(j);
			
		}
		
	}

}
