package Week_12_Recap_Date;

import java.time.LocalDate;


public class DateExample {
	
	static void GraduationDate(int year, int month, int dayOfMonth) {
		
	//	LocalDate graduationDate= LocalDate.of(year, month, dayOfMonth);
		
		LocalDate today= LocalDate.now();
		
		int year1=today.getYear();
		int month1=today.getMonthValue();
		int dayOfMonth1=today.getDayOfMonth();
		
		if(year==year1&&month==month1&&dayOfMonth==dayOfMonth1) {
			System.out.println("This is graduation day");
		}
		else {
			System.out.println("This is not graduation day");
		}
		
		
	}
	

	public static void main(String[] args) {
		
//java.time
		
		GraduationDate(2020,11, 13);
		
	}

}
