package revision;

@FunctionalInterface
interface marks1{
	void show();//only one abstract method
}
public class Student1 implements marks1 {
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show data");
	}
	
	public static void main(String[] args) {
		
		// normal way by creating class object and call interface
		Student1 std= new Student1();
		std.show();
		
	
	}

}
