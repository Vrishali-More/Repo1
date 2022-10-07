package com.kpi.lambda;

import java.util.concurrent.TimeUnit;

public class Task {
	
	

	public static void run() {
		// TODO Auto-generated method stub
		
		try {
			Long duration=(long)(Math.random()*5);
			System.out.println("Thread is Running");
			TimeUnit.SECONDS.sleep(duration);
			System.out.println("Task Completed");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
	}
	public static void main(String args[]) {
		Thread t2 = new Thread(Task::run);
          t2.start();
}
}
