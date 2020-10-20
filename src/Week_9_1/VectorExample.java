package Week_9_1;

import java.util.ArrayList;
import java.util.Vector;
/*
 * Vector is synchronized ,comparatively slower than arraylist
 * By default arraylist is not synchronized , but can be synchronized explicitly with Collections.synchronizedList
 */
public class VectorExample {

	public static void main(String[] args) {
		
		long time1=System.nanoTime();
		Vector object= new Vector<>();
		
		object.add("hasan");
		object.add("ahmet");
		object.add("ihsan");
		
		for (Object object2 : object) {
			System.out.println(object2);
			
		}
		long time2=System.nanoTime();
		
		
		long time3=System.nanoTime();
		ArrayList object1= new ArrayList<>();
		
		object1.add("zuhal");
		object1.add("nihal");
		object1.add("meral");
		
		for (Object object2 : object1) {
			System.out.println(object2);
		}
		long time4=System.nanoTime();
		
		System.out.println("ArrayList speed: " + (time4 -time3));
		System.out.println("Vector speed: " + (time2 -time1));
	}

}
