package com.kpi.lambda;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class Dateinfoque2 {

	public static void dateinfo()
	{
		LocalDate date = LocalDate.now();	
		LocalDate year=date.plus(8,ChronoUnit.YEARS);
		System.out.println("Monday 2030 date is :"+year);
		
		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd");
				Date d=sdf.parse("2030:10:9");
				sdf.applyPattern("EEE,d MM yyyy");
				String strdate = sdf.format(d);
				System.out.println(strdate);
				
				
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}
	
	public static void main(String args[]) {
		
		dateinfo();
		
	}
	
}
