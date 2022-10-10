package revision;
// Constructor Overloading
public class Addition {

	Addition(){
		System.out.println("Addition of numbers");
	}
	Addition(int a, int b){
		System.out.println("Addition of two numbers="+a+b);
		
	}
	Addition(int a, int b, int c){
		System.out.println("Addition of three numbers="+a+b+c);
	}
	
	public static void main(String[] args) {
		Addition addition= new Addition();
		Addition addition1= new Addition(2,3);
		Addition addition2= new Addition(4,5,1);
		System.out.println(addition1+""+addition2);

		
		
		
	}

}
