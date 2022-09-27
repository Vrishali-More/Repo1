package OOps;

public abstract class Bike {
	abstract void run();

}
class Test extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Running safelu");
		
		
	}
	Bike b=new Test();
	
	
	
}
