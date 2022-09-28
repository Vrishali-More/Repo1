package oops2;

public class MethodOverriding extends MethodOverriding2 {

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("Method Overriding");
	}
	
 public static void main(String args[]) {
	 MethodOverriding m=new MethodOverriding();
	 m.print();
 }


}
