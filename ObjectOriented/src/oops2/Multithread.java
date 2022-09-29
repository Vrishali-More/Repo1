package oops2;
 
class Multhiread2 extends Thread{
	public void run() {
		//System.out.println("run");
	}
}

public class Multithread {
public static void main(String args[]) {
	int n=8;
	for(int i=0;i<n;i++) {
	Multhiread2 m=new Multhiread2();
	m.start();
}
}
}
