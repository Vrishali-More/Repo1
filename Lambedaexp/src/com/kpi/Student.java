package com.kpi;

import java.util.ArrayList;
import java.util.List;

//interface Test{
//	void print(List test);	
//}
public class Student
{
	int rollno;
	
	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public static void main(String args[]) {
		Student std= new Student();
		Student std1= new Student();
		Student std2= new Student();
		Student std3= new Student();
		
		List<Student> list = new ArrayList<>();
		list.add(std);
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.forEach(emp2->emp2.getRollno());
}
}