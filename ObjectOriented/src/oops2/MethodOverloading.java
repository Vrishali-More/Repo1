package oops2;
// Compile time polymorphism 
public class MethodOverloading {
 /*
	public MethodOverloading() {
		// TODO Auto-generated constructor stub
	}
	
	*/
		static int abc() {
			return 1;
		}
	static int abc(int a , int b) {
		return a+b;
	}
	public static void main(String args[]) {
		MethodOverloading m1=new MethodOverloading();
	   MethodOverloading m2=new MethodOverloading();
	  System.out.println( m1.abc());
	  System.out.println( m2.abc(1,2));
	}
	}



