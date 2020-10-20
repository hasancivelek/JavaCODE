package Week_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			set1.add((int) (Math.random() * 10 + 1));
		}

//find sum of the elements in this set with iterator

		Iterator<Integer> iterator = set1.iterator();

		int sum = 0;

		System.out.println("Set: ");
		for (Integer integer : set1) {
			System.out.print(integer + " ");

		}
		System.out.println();
		while (iterator.hasNext()) {
			sum += iterator.next();

		}
		System.out.println(sum);

// Convert this set to arraylist

		ArrayList<Integer> list = new ArrayList<>();
		
//when you want to use iterator again , you need to re-initialize it
		Iterator<Integer> iterator2 = set1.iterator();
		System.out.println("ArrayList: ");
		while (iterator2.hasNext()) {
			list.add(iterator2.next());

		}
		System.out.println(list);

//convert the list into TreeSet
		
		Set<Integer> set2= new TreeSet<>();
		
		Iterator<Integer> iterator3= list.iterator();
		
		//loops trough list into treeSet
		for(int i=0; i<list.size();i++) {
			set2.add(list.get(i));
		}
		System.out.println("TreeSet: ");
		System.out.println(set2);
		
//		while(iterator3.hasNext()) {
//			set2.add(iterator3.next());
//			
//		}
//		System.out.println("TreeSet: ");
//		System.out.println(set2);

	}

}
