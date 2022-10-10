package functionalInterface;

import java.util.function.Function;

public class FunctionDemo {
// 3) Function- input, output
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Function<Integer,String>getInt=t->t*10 +"\t data multiplied by 10";
   System.out.println(getInt.apply(2));
	}

}
