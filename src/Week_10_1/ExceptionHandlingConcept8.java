package Week_10_1;

import java.util.Scanner;


public class ExceptionHandlingConcept8 {
	
	static int inputNumerator(Scanner scanner) {
		System.out.println("Input Numerator");
		return scanner.nextInt();
	}
	
	static int inputDenominator(Scanner scanner) {
		System.out.println("Input Denominator");
		return scanner.nextInt();
		
	}
	
	static void divede (int a, int b) throws ArithmeticException{
		System.out.println(a/b);
	}
//if our method has throws deceleration for runtime ( unchecked ) exception
	//it will not give underlined warning where it has been called
	
	public static void main(String[] args) {
		
Scanner scanner= new Scanner(System.in);
try {
divede(inputNumerator(scanner), inputDenominator(scanner));
}
catch (RuntimeException e) {
	
System.out.println("Undefined");
}

	}

}
