package Week_9_1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample {

	public static void main(String[] args) {
		// Arraylist is a list type which we can store multiple object
		//storing object as ordered(keeping insertion order)
		
		ArrayList list = new ArrayList<>();
		
		list.add("String");
		list.add(111);
		list.add(true);
		list.add(9.8);
		
	//	System.out.println(list);
		
		//for Each Loop
		for (Object object : list) {
		//	System.out.println(object);
			
		}
// for loop
		for (int i = 0; i < list.size(); i++) { //size():returns the length of Arraylist
			//System.out.println(list.get(i)); //get():retrieves elements from Arraylist
			
		}
		System.out.println(list.get(1));
		
		
	}

}
