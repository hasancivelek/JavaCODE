package Week_12_DateConcept;

import java.util.ArrayList;
import java.util.List;

public class PredicateExe {
	
	private static void printAnyThingIWant (List<String> employees , Predicate<String> query) {
		for(String employee: employees) {
			if(query.test(employee)) {
				System.out.println(query);
			}
		}
	}
	

	public static void main(String[] args) {
		
List<String> employees= new ArrayList<String>() ;

employees.add("Ahmet");
employees.add("John");
employees.add("Marry");
employees.add("Will");
employees.add("Jenkins");



printAnyThingIWant(employees, emp->emp.startsWith("J"));



	}

}
