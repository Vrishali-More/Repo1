package com.kpi.lambda;
import java.time.*;
import java.time.format.DateTimeFormatter;
/*import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
*/

public class DateTime {
	
	public static void LocalDateTimeApi()
	{
	// current date
	LocalDate date = LocalDate.now();
	System.out.println("The current date is:"+date);
	
	// Current time
	LocalTime time = LocalTime.now();
	System.out.println("Current time is:"+time);
	
	// will give as current time and date
	LocalDateTime current=LocalDateTime.now();
	System.out.println("current date time is :"+current);
	
	// to print in particular format
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd=MM-yyyy HH:mm:ss");
	String formatDateTime = current.format(format);
	System.out.println("in formatted manner"+formatDateTime);
	
	// printing months days and seconds
	
	Month month = current.getMonth();
	int day = current.getDayOfMonth();
	int seconds = current.getSecond();
	int hour=current.getHour();
	int year=current.getYear();
	System.out.println("Month: "+month+" day : "+day+" Seconds : "+seconds+" Hour : "+hour+" Year : "+year);
	

	//if we want am or pm then we write 
	DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd=MM-yyyy HH:mm:ss a");
	String formatDateTime1 = current.format(format1);
	System.out.println("in formatted manner"+formatDateTime1);
		
	// printing some specific date
	LocalDate date2 = LocalDate.of(1950, 1, 26);
	System.out.println("The rupblic day:"+date2);
	
	//printing date with current time
	LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
	System.out.println("specific date with current time:"+specificDate);
	
	
}
    //Driver code
 public static void main(String[] args)
 {
	LocalDateTimeApi();
	
}


}
