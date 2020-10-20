package Week_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
/*
 * HashMap vs HashTable: Hashtable is synchronized , hashmap is not synchronized
 */
	public static void main(String[] args) {
		
Map<String,String> emails= new HashMap<>();
//put() methods add elements  top map
//Keys are unique , but values can be same
emails.put("hasan@gmail.com", "123456");
emails.put("zuhal@gmail.com", "456");
emails.put("nihal@gmail.com", "123");
emails.put("ihsann@gmail.com", "135");

//for (Map.Entry entry:emails.entrySet()) {
//	System.out.println("keys: "+entry.getKey()+"\n"+"Value: " +entry.getValue());
//	
//}
//System.out.println(emails.get("hasan@gmail.com"));

//Iterator with map
Set set=emails.entrySet();

Iterator iterator=set.iterator();
while(iterator.hasNext()) {
	HashMap.Entry entry=(Entry) iterator.next();
	System.out.println("Key : " + entry.getKey());
	System.out.println("Value : " + entry.getValue());
}

	}

}
