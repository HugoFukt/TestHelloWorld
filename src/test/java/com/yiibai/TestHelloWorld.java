package com.yiibai;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelloWorld {
  @Test
  public void testMessageGenerator() {
	  RandomMessageGenerator obj = new RandomMessageGenerator();
	  String message = obj.generate();
	  
	  Assert.assertNotNull(message);
	  Assert.assertEquals(message, "Hello World!");
  }
}
