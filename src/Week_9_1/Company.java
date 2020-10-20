package Week_9_1;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * ArrayList has 3 constructor,Empty,List parameter and int initialCapacity constructors
 */
public class Company {
	
	int number;
	
	ArrayList<String> employees;
	
	ArrayList<VectorExample> vectorExamples;
	
	ArrayList<Object> list;//it can store every kind of object reference 
	

	public static void main(String[] args) {
		
Company object1= new Company();
object1.number=9;

ArrayList<String> emplooyeeList=new ArrayList<>(Arrays.asList("Hasan","Zuhal","Nihal","Ihasan","Meral"));

object1.employees=emplooyeeList;

ArrayList<VectorExample> vectorExamplesList= new ArrayList<>(Arrays.asList(new VectorExample(),new VectorExample(),new VectorExample()));




System.out.println(object1.vectorExamples);

ArrayList<Object> obejectlist= new ArrayList<>();

obejectlist.add(4);
obejectlist.add("String");
object1.list=obejectlist;

System.out.println(object1.list);

	}

}
