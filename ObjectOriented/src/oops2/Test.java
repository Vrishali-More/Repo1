package oops2;
// method overloading
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public int add() {
		return 1;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
public static void main(String a[]) {
	Test t=new Test();
	Test t1=new Test();
	System.out.println(t.add());
	System.out.println("Addition:"+t1.add(1,2));
}
}
