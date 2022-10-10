package revision;

@FunctionalInterface
interface Additiondemo{
	void add(int a, int b);
}
interface Substraction{
	void sub(int a, int b);
}

public class Calculator {
	
public static void addvalue(int a, int b) {
	System.out.println("Addition done  here:"+(a+b));
}

public static void subvalue(int a, int b) {
	System.out.println("Substraction is:"+(a-b));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Additiondemo obj= Calculator::addvalue;
     obj.add(1,2);
     
     Substraction obj1= Calculator::subvalue;
     obj1.sub(4,2);
         
	}

}
