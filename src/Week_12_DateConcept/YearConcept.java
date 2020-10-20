package Week_12_DateConcept;

import java.time.Year;

public class YearConcept {

	public static void main(String[] args) {
		
		//Year
		
				Year year=Year.now();
				
				System.out.println(year);
				
				System.out.println(year.isLeap());
				
				Year year2=Year.of(2010);
				System.out.println(year2.isLeap());
				
				Year year3 = Year.now();
				boolean check = year3.isAfter(year2);


	}

}
