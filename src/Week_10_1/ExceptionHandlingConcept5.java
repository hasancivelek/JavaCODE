package Week_10_1;

public class ExceptionHandlingConcept5 {
	
	static void method () throws Exception{
		
	}

	public static void main(String[] args) {

		//throw keyword throws exception
		
		
//throw new ArithmeticException(); //artificial expection

		try {
			throw new RuntimeException();
		} 
		catch (Exception e) {
			System.out.println("Exception Handling");
		}

	}

}
