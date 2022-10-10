package revision;

//Using Normal interface
public class Student implements Marks {

	@Override
	public void marks() {
		// TODO Auto-generated method stub
		System.out.println("88");
	}

	@Override
	public String sub() {
		// TODO Auto-generated method stub
		return "Java";
	}
	
	public static void main(String[] args) {
		Student std= new Student();
		std.marks();
		std.sub();
	}


}
