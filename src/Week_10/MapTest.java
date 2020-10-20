package Week_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		
		Map myMap= new HashMap<>();
		
		myMap.put(2012, 23);
		myMap.put("hasan", 1977);
		myMap.put(2007, "nihal");
		myMap.put("ihsan", "metin");
		
	//	System.out.println(myMap.size());
	//	System.out.println(myMap);
		
		Set set=myMap.entrySet();
		Iterator iterator=set.iterator();
		
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			
			HashMap.Entry entry= (Entry)iterator.next(); 
		//	System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
	}

}
