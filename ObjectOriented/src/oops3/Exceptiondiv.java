package oops3;
import java.util.Scanner;

public class Exceptiondiv {
	public static void main(String args[]) {
	int a;
	int b;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Value of a :"+a);
	System.out.println("Value of b:"+ b);
	
	
	//((int a,b); BufferedReader br = new BufferedReader(new int(1,2)));
	try
		{
		int num= a/b;
		System.out.println("Division"+num);
	}
	catch(Exception e) {
		System.out.println("Arithmetic Exception"); 
	}
	finally {
		System.out.println("Always execute");
	}
}

}