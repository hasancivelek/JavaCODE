package Week_10;

import java.util.*;

public class ListExample {
//Iterator works in list , queue and map, it can traverse elements forward
	//ListIterator works only list ,it can traverse elements backward and forward
	public static void main(String[] args) {
//Boxing: from primitive to object		

		int a=9;
		ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(6,6,7,9,4,3));
		
		list1.add(a);
		
	//	System.out.println(list1.get(6));//Unboxing:from object to primitive
		//Upcasting
	
	
		List<Integer> list2= new ArrayList<Integer>();
		List<Integer> list3= new LinkedList<Integer>();
		List<Integer> list4= new Vector<Integer>();
		
		//Vector 1-10
		for(int i= 0; i<10; i++) {
			list4.add((int)(Math.random()*10+1));
		}
		//use ListIterator to traverse forward direction and backward direction
		
		
		ListIterator<Integer> iterator3= list4.listIterator();
		
		
		System.out.println("Vector forward : ");
		
		while(iterator3.hasNext()) {
			System.out.print(iterator3.next()+" ");
			
		}
		System.out.println();
		System.out.println("Vector backward : ");
		while (iterator3.hasPrevious()) {
			
System.out.print(iterator3.previous()+" ");
			
		}
		
		System.out.println();
		
		
		//LinkedList 10 integers 1-10
		
		for(int i= 0; i<10; i++) {
			list3.add((int)(Math.random()*10+1));
		}
		ListIterator<Integer> iterator2=list3.listIterator();
		System.out.println("LinkedList :");
		while(iterator2.hasNext()){
			System.out.print(iterator2.next()+" ");
			
		}
		System.out.println();
			
		//ArrayList fill 10 integers from 1-10
		
				for(int i= 0; i<10; i++) {
					list2.add((int)(Math.random()*10+1));
				}
			//Iterate trough list2 with ListIterator
		
		ListIterator<Integer> iterator1 = list2.listIterator();
		System.out.println("ArrayList :");
		while(iterator1.hasNext()) {
			System.out.print(iterator1.next()+" ");
			
		}
		
		
		
		
	 
			

	}

}
