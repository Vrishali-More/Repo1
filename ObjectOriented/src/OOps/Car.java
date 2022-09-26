package OOps;

public class Car extends Vechical {

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
/*
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Vechical is Car");
	}*/
	int mileage(int test) {
		return 10;
	}
	int loadcapacity(int test) {
		return 50;
	}
	@Override
	public void runn() {
		// TODO Auto-generated method stub
		System.out.println(" Car is running");
	}

 public static void main(String args[]) {
	// Running obj=new Car();
	// obj.runn();
	// obj.mileage();
	// obj.loadcapacity();
 }


}
