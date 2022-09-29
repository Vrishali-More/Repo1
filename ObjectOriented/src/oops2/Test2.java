package oops2;
 class test1{
	 int abc() {
		 return 1;
	 }
 }
public class Test2 extends test1 {

	/*public Test2() {
		// TODO Auto-generated constructor stub
	}
*/ 
	// Method Overriding 
	int abc() {
	return 2;
}
public static void main(String a[]) {
	Test2 obj=new Test2();
	System.out.println(obj.abc());
	
}
	
}
