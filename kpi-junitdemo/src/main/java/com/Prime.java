package com;

public class Prime {
public int evaluate(String expression) {
	
	int i; 
	int m=0;
	int flag=0;
    int n=13;
	m =n/2;
	
	if (n==0||n==1) {
		System.out.println("is not prime");
	}
	else
	{
		for(i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println("is prime number");
				flag=1;
				break;
				
			}
		}
		if(flag==0) {
			System.out.println("is prime number");
		}
	}
	
	return n;
}
}
