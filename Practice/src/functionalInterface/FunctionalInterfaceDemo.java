package functionalInterface;

@FunctionalInterface
interface add
{
	void run();// having only one abstract method
}
public class FunctionalInterfaceDemo implements add {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running now");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceDemo obj=new FunctionalInterfaceDemo();
		obj.run();
	}

}
