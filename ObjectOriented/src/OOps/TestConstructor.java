package OOps;

public class TestConstructor {
	int num;
	String name;
	public TestConstructor() {
		// TODO Auto-generated constructor stub
		System.out.println("TestConstructor");
	}
	public TestConstructor(int num, String name) {
		num=1;
		name="name";
	}
	void display() {
		System.out.println(num+""+name);
	}
		
		public static void main(String a[]) {
			//TestConstructor();
			TestConstructor t1=new TestConstructor(1,"abc");
			t1.display();
		}
	

}
