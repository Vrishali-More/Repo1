package oops3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author VishaliMore
 *
 */
public class TestCollection {

	public static void main(String a[]) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList list2 = new ArrayList();
		list.add("a");
		list.add("b");
		list2.add(1);
		list2.add("x");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list2);
		
		for(int i=0;i<list.size();i++) {
		//list.get(i);// 0,1,...
		if(list.get(i)=="z")// output is z index value
			System.out.println(i);
		
		
		}
		for(int j=0; j<10; j++)
		{
			list2.add(j);
			//System.out.println(list2);
			
		}
		System.out.println(list2);
		
		
		
		
	
		

	}
	
}
