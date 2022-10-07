package oops5;


@FunctionalInterface
interface Mad{
	String Madboy(String mad); // Abstract method
}

interface Recover{
	String recover1(String r);	// Abstract Method
}

public class Lambdaexp {

	private String condition(String m, Mad mad1 ) {
		return mad1.Madboy( m);
	}
	private String condition2(String recover, Recover r)
	{
		return r.recover1( recover);
	}
	

	public static void main(String args[]) {
		Lambdaexp obj= new Lambdaexp();
		Mad boy1=(String mad)-> mad;
		Mad boy2=(String mad)->mad;
		Mad boy3= (String mad)-> mad;
		Mad m1=(String mad)->mad;
		Mad m2=(String mad)->mad;
		Mad m3=(String mad)->mad;
		Recover boy4=(String recover)->recover;
		Recover m4= (String recover)->recover;
		
		System.out.println(obj.condition( "mad Boy1",boy1));
		System.out.println(obj.condition( "mad Boy2",boy2));
		System.out.println(obj.condition( "mad Boy3",boy3));
		System.out.println(obj.condition( "mad Man1",m1));
		System.out.println(obj.condition( "mad Man2",m2));
		System.out.println(obj.condition( "mad Man3",m3));
		System.out.println("Recovered are");
		System.out.println(obj.condition2( "Recover Boy4",boy4));
		System.out.println(obj.condition2( "Recover Man4",m4));
		
	
	
	}
	
}

