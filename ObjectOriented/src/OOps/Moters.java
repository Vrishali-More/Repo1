package OOps;
 interface Runnable{
 void run();
 }
 class Auto implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("auto is running");
	}
 }
	class Bike implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Bike is running");
		}
		
	}
	class Bicycle implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Bicycle is running");
		}
		
	}
	class Riksha implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("riksha is rinning");
		}
		
	}
	
 public	class Moters{
	 public static void main(String args[]) {
		 Runnable obj= new Bike();
	obj.run();
	 }
 }


