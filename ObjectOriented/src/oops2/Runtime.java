package oops2;

public class Runtime {

	void run() {
		System.out.println("Runtime class");
		
	}
}
	class Run extends Runtime{
		void run() {
			System.out.println("Run Class");
		}

	public static void main(String args[]) {
		Run r= new Run();
		r.run();
	}
}
