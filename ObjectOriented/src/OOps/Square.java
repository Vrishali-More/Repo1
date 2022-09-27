package OOps;
class Subsquare{
	static int area2(int a) {
		return  a*a;
	}
}
public class Square extends Area {

public static void main(String args[]) {
	 
	 Area a= new Area();
	 a.areaseq();
	 System.out.println(Subsquare.area2(4));
	 
	 
}
}
