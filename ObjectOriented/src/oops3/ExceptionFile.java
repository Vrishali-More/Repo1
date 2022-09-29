package oops3;

//Question: Search for file in your local disk 
import java.io.FileInputStream; // use to read data from source
import java.io.FileNotFoundException;
// Input Stream handles data flowing into a program
public class ExceptionFile {
	public static void main(String a[]) {
		
		try
		{
			FileInputStream fr = new FileInputStream("D:\\respositry\\Repo1\\2.txt");
			System.out.println("File founded"); 
		}
		catch(FileNotFoundException e)
		{
			//e.printStackTrace(); 
			System.out.println("File will not available in your local");
		}
		
	}
	
	
	
	
	/*import java.util.Scanner;
	//import java.io.FileOutputStream;
		scanner = new Scanner(new File("test.txt"));
	    while (scanner.hasNext()) {
	        System.out.println(scanner.nextLine());
	    }
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} finally {
	    if (scanner != null) {
	        scanner.close();
	    }
	}
	*/


	
}
