package Week_11;

import java.util.ArrayList;

public class WrapperClassesConcept {

	public static void main(String[] args) {
		//Wrapper classes are object version of primitive data types
		//Integer , Double, Byte,Short, Float
		//Wrapper classes are provides machanisim to convert primitive data type to object
		Integer num = new Integer(99);
		System.out.println(num+99);
		
		ArrayList<Integer> list= new ArrayList<>();
		int number = 23;
		list.add(number);//Boxing : primitive to object
		list.add(99);
		list.add(98);
		list.add(num);
		
		int number2=list.get(0);//unboxing : object to primitive
		
		Number numberObject= new Integer(99);//garbage
		numberObject= new Double(99.99);

	}

}
