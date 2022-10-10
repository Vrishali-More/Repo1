package revision;

public class Employee {
	int id;
	String name;
	int salary;
	Employee(){
		System.out.println("Employee constructor");
	}
	Employee(int id){
		
		System.out.println("Employee id:"+id);
	
	}
	Employee(int id, String name, int salary){
		
		System.out.println("Employee id name salary"+id+"\t"+name+"\t"+salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp=new Employee();
    Employee emp1=new Employee(1);
    Employee emp2=new Employee(1,"abc",25000);
	System.out.println(emp1);
	System.out.println(emp2);
	
	}

}
