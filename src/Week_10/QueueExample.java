package Week_10;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
Queue <String>queue= new PriorityQueue<>();

queue.add("zuhal");
queue.add("hasan");
queue.add("nihal");
System.out.println(queue);

Iterator iterator=queue.iterator();

while(iterator.hasNext()) {
	System.out.println(iterator.next());
}

	}

}
