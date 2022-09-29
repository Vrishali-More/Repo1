package oops3;

import java.io.FileOutputStream; // use to write data to a destination
// OutputStream Handles data Flow out of the program
public class TryWithResources {
	
public static void main(String a[]) {
	
	try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\respositry\\Repo1\\1.txt"))
	{ 
		String msg ="Welcome to Java";
	    byte byteArray[] = msg.getBytes();
	    fileOutputStream.write(byteArray);
	    System.out.println("written succefully");
	}
	catch(Exception exception) {
		System.out.println(exception);
	}
	finally {
		System.out.println("I am write ");
	
	}
			
}

}
