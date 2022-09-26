package OOps;

public class Truck extends Vechical{

	@Override
	int mileage() {
		// TODO Auto-generated method stub
		return 10;
	}
	@Override
	int loadcapacity() {
		// TODO Auto-generated method stub
		return 50;
	}
	@Override
	public void runn() {
		// TODO Auto-generated method stub
		System.out.println("Truck is running");
	}


	/*@Override
//	void run() {
		// TODO Auto-generated method stub
		System.out.println("Vechical is Truck");
	}*/
	int mileage(int test) {
		return 10;
	}
	int loadcapacity(int test) {
		return 50;
	}
public static void main(String args[]) {
	Running obj=new Truck();
	obj.runn();
	// obj.mileage();
	 //obj.loadcapacity();
}


}
