package com.kpi;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Testforeach
{
	void print(List test);
}
public class List1 {

	public static void main(String args[]) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Book");
		list1.add("Pens");
		list1.add("NoteBook");
		list1.add("Papers");
		list1.add("Pencil");
		list1.add("Eraser");
		
		// using foreach iterator
		
		System.out.println("iterating the values");
		list1.forEach(boxaccesiries ->System.out.println(boxaccesiries));
		Testforeach test = boxaccesiries ->System.out.println(boxaccesiries);
		
	}
	}

