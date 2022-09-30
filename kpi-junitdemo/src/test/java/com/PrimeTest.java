package com;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeTest {
   @Test
   
   public void evaluatesExpression() {
       Prime prime = new Prime();
      int n = prime.evaluate("13");
       assertEquals(13, n);
      
   }
	
}
