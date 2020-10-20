package Week_12_DateConcept;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConcept {

	public static void main(String[] args) {
		
LocalTime time1=LocalTime.now();
System.out.println(time1);

time1= LocalTime.of(9, 59);
System.out.println(time1);

//TimeFormatter

LocalTime time2=LocalTime.now();

DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("hh:mm:ss a");
String stringTime=time2.format(dateTimeFormatter);
System.out.println(stringTime);

boolean check= time1.isAfter(time2);
System.out.println(check);


	}

}
