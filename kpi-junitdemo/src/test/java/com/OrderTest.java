package com;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrderTest {

	@Test 
	
	 public void evaluatesExpression() {
       Order order = new Order();
      String name= order.evaluate("Poha");
       assertEquals("Poha", name);
       
       
    
	
	}
	
}
