package Week_10_1;

public class ExceptionHandligConcept4 {
	// throws keyword : Declares that method throws exception
	static void method () throws Exception {
		
		//System.out.println(9/0);
	}

	public static void main(String[] args)throws InterruptedException { //throws Exception diger cozum
		
try {
	method();
} 
catch (Exception e) {
	System.out.println("ArithmeticException");
}

System.out.println("Hi");
Thread.sleep(4000);
System.out.println("Hi Again");

	}

}
