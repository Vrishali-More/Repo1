package revision;
//Normal interface
interface Animal{
	String color(String color);
	void bark();
}
public class Dog implements Animal{

	
	@Override
	public String color(String color) {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog is barking");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Dog d= new Dog();
      d.color("White");
      d.bark();
      System.out.println(d.color("White"));
		
	}


}
