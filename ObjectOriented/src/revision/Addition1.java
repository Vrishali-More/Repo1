package revision;

public class Addition1 {

	// Method overloading
		public static int add() {
			return 1;
		}
		public static int add(int a,int b) {
			return a+b;
		}
		public static int add(int a, int b ,int c) {
			return a+b+c;
		}
		
		
	public static void main(String[] args) {
		
		/* call method using creating object
		Addition1 obj= new Addition1();
		
		  obj.add(); obj.add(2,3); obj.add(1,2,3);
		  System.out.println("Addition of two numbers:"+obj.add(2,3)+
		  "\n"+"Addition of three numbers:"+obj.add(1,2,3));
		 */
		
		// call method without creating object
		
		Addition1.add();// static method directly call in another static method
	    Addition1.add(1,2);
	    Addition1.add(1,2,3);
	    System.out.println( "Addition of two numbers:"+Addition1.add(1,2));
	    System.out.println( "Addition of three numbers:"+Addition1.add(1,2,3));
		
	}
	

}
