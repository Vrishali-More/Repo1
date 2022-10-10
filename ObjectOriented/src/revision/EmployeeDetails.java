package revision;
// constructor Overloading Method Overloading
public class EmployeeDetails {
	int id;
	String name;
	EmployeeDetails(){
		System.out.println("EmployeeDetails");
	}
	EmployeeDetails(int id, String name){
		System.out.println(id+"\t"+name);
	}
	// for method overloading
	public static void empname (String firstname) {
	
		System.out.println("First name:\t"+firstname);
	}
	public static void empname(String firstname, String lastname) {
		
		System.out.println("FullName:\t"+firstname+"\t"+lastname);
	}
	
	public static void main(String[] args) {
		//method overloading
		EmployeeDetails.empname("Vrishali");
		EmployeeDetails.empname("Vrishali", "More");
		
		// for constructor
		EmployeeDetails emp1= new EmployeeDetails();
		EmployeeDetails emp2= new EmployeeDetails(1,"Vrishali");
		
		
	}

}
