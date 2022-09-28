package oops2;

public class MethodOverriding extends MethodOverriding2 {

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("MethodOverriding inherit MethodOverriding2");
	}
 
	
	
	// MethodOverloading with Constructor 
	// method can have a same name but different parameters can be perform method overloading 
	/*public MethodOverriding() {
		// TODO Auto-generated constructor stub
	}
	public MethodOverriding(int a,int b) {
		System.out.println("Overrided");
	}*/
 public static void main(String args[]) {
	 MethodOverriding m=new MethodOverriding();
	 m.print();
 }
}
