package oops3;
import java.util.*;

public class Twr {
	public static void main(String args[]) {
		
	  
//int a,b;
try(Scanner sc = new Scanner(System.in);
		Scanner sc1=new Scanner(System.in))
{
 int num= sc.nextInt()+sc1.nextInt();	  
 System.out.println("Addition"+num);
 
}
catch(Exception e) {
	e.printStackTrace();
}
finally {
	System.out.println("Finally block");
}
}
}