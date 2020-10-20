package Week_12_Recap_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

//		LocalDateTime time = LocalDateTime.now();
//
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(" h:m:s:a:E M/dd/yyyy w W");
//
//		System.out.println(time.format(dateTimeFormatter));

//sep 23
		LocalDate date = LocalDate.of(2020, 9, 23);

 dateTimeFormatter = DateTimeFormatter.ofPattern("MMM  dd yyyy");

		System.out.println(date.format(dateTimeFormatter));

	}

}
