package oops4;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


public class JanuaryDay {
public static void LocalDateApi1()
{
	
	LocalDate date2 = LocalDate.of(1922, 1, 26);
	System.out.println("The date is:"+date2);
	
	Calendar cal= Calendar.getInstance();
	cal.set(Calendar.YEAR,1922);
	cal.set(Calendar.MONTH,26);
	cal.set(Calendar.DAY_OF_MONTH,1);
	Date df=cal.getTime();
	DateFormat dff = new SimpleDateFormat("EEEEEE");
	String day = dff.format(df);
	System.out.println("The day is:"+day);
	
	
	
} 

public static void main(String args[]) {
	LocalDateApi1();
}
}
