package OOps;
class Subrectangle{
	static int area1(int l, int b) {
		return  l*b;
	}
}
public class Rectangle extends Area{
	
 public static void main(String args[]) {
	 
	 Area a= new Area();
	 a.arearec();
	 System.out.println(Subrectangle.area1(5, 2));
 }
}
