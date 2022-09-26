package OOps;

public class Bus extends Vechical {

	@Override
	int mileage() {
		// TODO Auto-generated method stub
		return 10;
	}
	@Override
	int loadcapacity() {
		// TODO Auto-generated method stub
		return 55;
	}

	/*@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Vechical is Bus");
	}*/
	int mileage(int test) {
		return 10;
	}
	int loadcapacity(int test) {
		return 55;
	}
	@Override
	public void runn() {
		// TODO Auto-generated method stub
		System.out.println("Bus is running");
	}

public static void main(String args[]) {
	//Running obj=new Bus();
	// obj.mileage();
	// obj.loadcapacity();
}



}
