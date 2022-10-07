package oops4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Chrono {

	public static void CheckingChronoEnum() throws ParseException
	{
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse("26-01-1922");
		System.out.println(date);
		
		LocalDate date2 = LocalDate.of(1922, 1, 26);
		System.out.println("The rupblic day:"+date2);
	}
	//Driver code
	public static void main(String args[]) throws ParseException {
		CheckingChronoEnum();
	}
	
}
