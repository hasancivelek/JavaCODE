package Week_12_DateConcept;

import java.time.LocalDate;

public class DateConcept1 {

	public static void main(String[] args) {
		
		LocalDate today= LocalDate.now();
		
		System.out.println(today);
		
		System.out.println("Tomorrow's date : "+ today.plusDays(1));
		
		//find out yesterday's date
		//System.out.println(today.plusDays(-1));
		System.out.println("Yesterday's date : " + today.minusDays(1));
		
		//date one week later
		
		System.out.println("One week later: " + today.plusWeeks(1));
		
		//length of this year
		
		System.out.println(today.lengthOfYear());
		
		System.out.println(today.isLeapYear());
		
		System.out.printf("%s  days in %s ", today.lengthOfYear(),today.getYear());
		
		

		
//		int a=method();
//		int a1=DateConcept1.method();
//
//		System.out.println(method());
//		System.out.println(a);
//		
	}
	
//	static int method() {
//		return 9;
	
	//} 

}
