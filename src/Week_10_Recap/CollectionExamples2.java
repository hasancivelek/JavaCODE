package Week_10_Recap;

import java.util.Map;
import java.util.TreeMap;

//TreeMap
public class CollectionExamples2 {

	public static void main(String[] args) {
		
Map<String, String> map1=new TreeMap<String, String>();

//enter title and url
map1.put("Our Team", "http://www.siliconelabs.com/teachers");
map1.put("About Us", "http://www.siliconelabs.com/aboutus");
map1.put("Courses", "http://www.siliconelabs.com/courses");

//for each loop 1
for (Map.Entry<String, String> entry : map1.entrySet()) {
	//System.out.println(entry.getKey()+" ," +entry.getValue());
	
}
//for each loop 2

for(String keys:map1.keySet()) {
	String value=map1.get(keys);
	System.out.println("Keys : " + keys +" "+"Values : "+ value);
}


	}

}
