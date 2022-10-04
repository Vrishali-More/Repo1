package com.kpi;

public class MR2 {

	public static void Threadstatus() {
		System.out.println("Running..");
	}
	public static void main(String args[]) {
		Thread t2 = new Thread(MR2::Threadstatus);
		t2.start();
	}
}
