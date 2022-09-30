package com;

public class Order {
//public String ordername(String name) {
	 public String evaluate(String expression) {
		String a= "Poha";
		String b="Dosa";
		String name="Poha";
		

		if(name==a) {
			System.out.println(" you order poha ");
			System.out.println("And price is 50");
		}
		else if(name==b)
		{
			System.out.println("your order is dosa \n price is 40");
		}
		else {
			System.out.println("Order is not avaliable");
		}
		
		
		 return name;
	}

	}

	





