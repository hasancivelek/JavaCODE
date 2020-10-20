package Week_10_Recap;

import java.util.*;

public class CollectionExamples {
//ListIterator vs Iterator : We can iterator only list with listIterator
	//with ListIterator , we can iterate trough backward and forward
	public static void main(String[] args) {
		
//how to declare collection reference
//lists,Sets or in Queue,
//formula:ClassName<Object Type> referenceNmae= new ClassName<>();
//formula:InterfaceName<Object Type> referenceNmae= new ClassName<>();		
	 //List	
		List<String> collection=new ArrayList<>();
		
		List<String> collection1=new LinkedList<>();
		
		List<String> collection2=new Vector<>();
	 //Set	
		Set<Object> collection3= new HashSet<>();
		
		Set<Object> collection4= new LinkedHashSet<>();
		
		Set<Object> collection5= new TreeSet<>();
		
		//Map
		
//formula:ClassName<Key, Value> referenceNmae= new ClassName<>();
//formula:InterfaceName<Key,Value> referenceNmae= new ClassName<>()
		
		Map<Integer, Object> collection9= new TreeMap<>();
		
		Map<String, Object> collection7= new HashMap<String, Object>();
		
		Map<String, Object> collection8= new LinkedHashMap<String, Object>();
		
		collection1.add("String 1");
		collection1.add("String 2");
		collection1.add("String 3");
		
		for(int i= 0; i<collection1.size(); i++) {
			//System.out.println(collection1.get(i));
			
		}
		
		collection3.add("String 1");
		collection3.add("String 2");
		collection3.add("String 3");
		//System.out.println(collection3);
		//for each loops
		for (Object object : collection3) {
			//System.out.println(object);
		}
		//Iterator
		
		Iterator iterator = collection3.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//map
		Map<Integer, String> collection6 = new TreeMap<>();
		
		collection6.put(0, "123");
		collection6.put(1, "1234");
		collection6.put(2, "1235");
		
		//System.out.println(collection6.get(3));
	
	
	for(int i=0; i<3; i++) {
		//System.out.println(collection6.get(i));
	}
	// get values 
	for (Object object : collection6.values()) {
		//System.out.println("values : " + object);
		
	}
		//get keys
	
	for(Integer object : collection6.keySet()) {
		//System.out.println("keys :" + object);
	}
	
	//key and value together
	
	for(Integer keys:collection6.keySet()) {
		String value=collection6.get(keys);
		System.out.println("Keys : " + keys +" "+"Values : "+ value);
	}
		
	}

}
