package Week_10_1;

import java.util.Scanner;

public class ExceptionHandlingConcept {
//Exception : Error events which can accur during execution time , it can disrupts the flow of the program
	public static void main(String[] args) {
	
		//Try-Catch	
		try {
			System.out.println(9/0);
		} catch (ArithmeticException e) {
			//Parameter can be changed into
			//ArithmeticException or it is superclasses
			System.out.println("undefind");
		}//undefined
		
		System.out.println("Hello Word");
		
		
		
//		Scanner scanner= new Scanner(System.in);
//		System.out.println("input your age : ");
//		int age = scanner.nextInt();
		
		//int [] arr= {0};
	//	arr[4]=0;

	}

}
