package oops2;

interface DefaultM{ //Interface
	
	public void Add();// Abstract method
	
	default void show(int a, int b) { // Default Method
		System.out.println("Addition:"+(a+b));
	}
}
public class DefaultMethod implements DefaultM {

	@Override
	public void Add() {
		// TODO Auto-generated method stub
		System.out.println("Addition of two numbers");
	}
public static void main(String a[]) {
	DefaultMethod d= new DefaultMethod();
	d.Add();
	d.show(4,5);
}
}
