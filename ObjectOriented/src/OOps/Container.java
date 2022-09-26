package OOps;

public class Container extends Vechical {

	@Override
	int mileage() {
		// TODO Auto-generated method stub
		return 11;
	}
	@Override
	int loadcapacity() {
		// TODO Auto-generated method stub
		return 89;
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Vechical is Container");
	}
	int mileage(int test) {
		return 11;
	}
	int loadcapacity(int test) {
		return 89;
	}
public static void main(String args[]) {
	Vechical obj=new Container();
	 obj.mileage();
	 obj.loadcapacity();
}

}
