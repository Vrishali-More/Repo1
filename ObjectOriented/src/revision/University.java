package revision;

@FunctionalInterface
interface Collage{
 void name();
}
public class University {
	
 public static void Cname(){
	 System.out.println("Name of collage");
 }
 
	 public static void main(String[] args) {  
		 
		 // using method reference
		 Collage collage= University::Cname;
		 
		 collage.name();
	 }
 }

