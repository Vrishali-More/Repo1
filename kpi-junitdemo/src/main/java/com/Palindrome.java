package com;

public class Palindrome {
	public int evaluate(String expression) {
		int rem;
		int sum=0; 
		int n=121;
		int temp;
		temp=n;
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			
			
			
		}
		if(temp==sum) {
			System.out.println( "Number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		
		return sum;
		
	}
	
	

}
