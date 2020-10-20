package Week_9_1;

import java.util.LinkedList;
/*
 * Arraylist uses dynamic array -- Linked list uses doubly linked list
 * 
 * Arraylist manipulation is slower than linkedlist
 * 
 * linkedlist acts like list and queue, arraylist acts like a list
 * 
 * Arraylist is good for accessing  or sorting the data
 * 
 * Linked is better for data manipulation
 */
public class LinkedListConcept {

	public static void main(String[] args) {
		
//LinkedList is also ordered and it keeps it's insertion order
		
		LinkedList linkedList= new LinkedList<>();
		
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add("hasan");
		linkedList.add(6);
		linkedList.add(3);
		
		
	//	System.out.println(linkedList.get(2));
		
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
			
			
		}

	}

}
