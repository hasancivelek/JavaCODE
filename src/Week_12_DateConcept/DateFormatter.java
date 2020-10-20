package Week_12_DateConcept;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

	public static void main(String[] args) {
		
//date formatter example
		
		LocalDate date = LocalDate.of(2020, 12, 23);
		System.out.println(date);
		// 1 way
		String dateStr=date.format(DateTimeFormatter.ofPattern("MMMM dd yyyy Q G  "));
		System.out.println(dateStr);
		
		//2 way
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("EEEE, MM/dd/yy");
		String formattedDate=date.format(dateTimeFormatter);
		System.out.println(formattedDate);

	}

}
