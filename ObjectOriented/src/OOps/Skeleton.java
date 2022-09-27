package OOps;

public class Skeleton implements Abc, Xyz {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is class ");
	}

	public static void main(String args[]) {
		Skeleton sk=new Skeleton();
		sk.print();
		
	}
}
