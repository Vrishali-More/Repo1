package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeTest {
	
	@Test 
	
	 public void evaluatesExpression() {
        Palindrome p = new Palindrome();
       int sum = p.evaluate("121");
        assertEquals(121, sum);
        
        
     
	}

}
