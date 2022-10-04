package oops4;

interface MathOperation{
	int operation(int a, int b);
}
public class LambdaPractice {
	
	
	public static void main(String args[]) {
		LambdaPractice tester = new LambdaPractice();
		
		MathOperation addition = (int a, int b)-> a+b;
		MathOperation substraction = (a,b)->a-b;
		MathOperation multiplication=(a,b)->{return a*b;};
		MathOperation division = (int a, int b)->a/b;
		
	}

}
