package OOps;

public abstract class Bike {
 abstract void run();
}
class Test extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("running safely");
	}
	public static void main(String args[]) {
		Bike obj=new Test();
		Bike obj1=new Test();
		obj.run();
		obj1.run();
		
	}
}