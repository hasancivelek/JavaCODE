package Week_9_1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorConcept {

	public static void main(String[] args) {
		//Initial capacity of arraylist = 10
		ArrayList <Double>arrayList1 = new ArrayList<Double>();

		arrayList1.add(13.3);
		arrayList1.add(14.3);
		arrayList1.add(17.3);
		arrayList1.add(15.3);
		
		ListIterator iterator = arrayList1.listIterator();
		
		System.out.println("Traversing forward direction");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println("Traversing backward direction");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
			
		}

	}

}
