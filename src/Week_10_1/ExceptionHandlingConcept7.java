package Week_10_1;

import java.io.IOException;

public class ExceptionHandlingConcept7 {
	
	/*
	 * Throws Keyword:decleration of exception in method header
	 * 
	 * throw : creates exception
	 */
	static void methods() throws IOException{
		
		throw new IOException();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("1");
		
		Thread.sleep(4000);
		
		System.out.println("2");
		
		try {
			methods();
		} 
		catch (IOException e) {
			System.out.println();
		}
		
	}

}
