package Week_9_1;

import java.util.ArrayList;
import java.util.Iterator;



public class ArraylistExample2 {

	public static void main(String[] args) {
//Generic ArrayList		
ArrayList <String>arrayList = new ArrayList<String>();

arrayList.add("String");
//arrayList.add(5);

ArrayList <Double>arrayList1 = new ArrayList<Double>();

arrayList1.add(13.3);
arrayList1.add(14.3);
arrayList1.add(17.3);
arrayList1.add(15.3);

//Iterator

Iterator iterator= arrayList1.iterator();

//while(iterator.hasNext()) {
//	System.out.println(iterator.next());
//}

// For loop

for(int i=0; i<arrayList1.size(); i++) {
	if(iterator.hasNext()) {
	System.out.println(iterator.next());
	
	}
}


	}

}
