package OOps;

public class Skeleton implements Abc, Xyz {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is class ");
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("White color");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Xyz");
	}

	public static void main(String args[]) {
		Skeleton sk=new Skeleton();
		sk.print();
		sk.color();
		sk.name();
		
		
	}

	
}
