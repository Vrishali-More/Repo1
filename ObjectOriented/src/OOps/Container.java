package OOps;

public class Container extends Vechical {

	@Override
	int mileage() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	int loadcapacity() {
		// TODO Auto-generated method stub
		return 89;
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
	int mileage(int test) {
		return 10;
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
