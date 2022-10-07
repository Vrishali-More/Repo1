package com.kpi.lambda;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;


public class JanuaryDay {
public static void LocalDateApi1()
{

	
	LocalDateTime current=LocalDateTime.now();
	System.out.println("current date time is :"+current);
	
	LocalDate date2 = LocalDate.of(1922, 1, 26);
	System.out.println("The day is:"+date2);
	
	Month month = current.getMonth();
	int day = current.getDayOfMonth();
	int seconds = current.getSecond();
	int hour=current.getHour();
	int year1=current.getYear();
	System.out.println("Month: "+month+" day : "+day+" Seconds : "+seconds+" Hour : "+hour+" Year : "+year1);
	
	
} 

public static void main(String args[]) {
	LocalDateApi1();
}
}
