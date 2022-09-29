package oops3;

import java.util.ArrayList;// for list
import java.util.HashMap;// for HashMap
import java.util.HashSet;// for HashSet
import java.util.Map;// for map
import java.util.Set;// for set

public class ArrayListEX {
public static void main(String args[]) {
	ArrayList<String> list = new ArrayList<String>();
	// ArrayList allows duplicate values
	list.add("a");

	list.add("b");
	list.add("b");
	
	list.add("c");
	list.add("c");
	list.add("c");
	
	System.out.println("ArrayList:"+list);
	
	// creating hashset
			// hashing :set uses hashtable for internal implementation 
			Set<String> set= new HashSet<String>();
			Set set2= new HashSet();
			set.add("a");
			set.add("a");// does not allowed duplicate values
			set2.add(1);
			System.out.println("HashSet:"+set);
			
			
			//Map<key, values>
			
			Map<String, Integer>hm = new HashMap<String , Integer>();
			/*hm.put("a", new Integer(100));//puting value with respect to key
			hm.put("b", new Integer(200));
			hm.put("c", new Integer(300));
			hm.put("d", new Integer(400) );
			*/
				hm.put("a", 1);	
				hm.put("b", 2);
				hm.put("c", 3);
				hm.put("a", 4);
				hm.get("a"); 
			// does not allowed duplicate key but values are allowed
			System.out.println("HashMap:"+hm);
			
			
}
}
