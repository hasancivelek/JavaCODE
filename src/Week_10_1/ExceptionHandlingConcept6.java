package Week_10_1;

import java.io.IOException;

//Two ways to handle exception 
//1-Try catch 2-add throws declaration(prevents compilation error)
public class ExceptionHandlingConcept6 {

	static void method() throws Exception{
		throw new IOException();
	}
	public static void main(String[] args) {
	//	public static void main(String[] args) throws Exception{} //2.yontem
		//1.yontem
		try {
			method();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}

	}

}
