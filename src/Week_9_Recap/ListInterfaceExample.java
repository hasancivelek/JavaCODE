package Week_9_Recap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/*
 * List interface: vector, ArrayList .LinkedList
 * 
 * Lits:all list classes are ordered(maintains insertion order)
 * 
 * all list classes are indexed
 * 
 * ArrayList vs Vector:vector is sycsnronized, arraylist can be sync. implicitly
 * 
 * ArrayList vs LinkedList:LinkedList algorithm works with doubly linked list array list works with arrays
 */
public class ListInterfaceExample {

	public static void main(String[] args) {
	//ArrayList default capacity=10	
ArrayList arrayList= new ArrayList<>();
arrayList.add("String");
arrayList.add(9);

ArrayList<Object> arrayList2= new ArrayList<>();

arrayList2.add("hasan");
arrayList2.add(new ListInterfaceExample());
System.out.println(arrayList2.get(0));

//methods in arraylist

//LinkedList


LinkedList<Object> linkedlist= new LinkedList<>();

linkedlist.add(9);
linkedlist.add("String");

System.out.println(linkedlist.get(0));

Iterator iterator= linkedlist.iterator();

while (iterator.hasNext()) {
	System.out.println(iterator.next());
	
}

//Vector

Vector<Object> vector= new Vector<>();

vector.add(900);
vector.add("String 99");

System.out.println(vector.get(0));


	}

}
