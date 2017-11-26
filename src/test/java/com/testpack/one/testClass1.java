package com.testpack.one;

import org.testng.annotations.Test;

import com.mainpack.one.mainClass1;

public class testClass1 extends mainClass1{
  @Test
  public void f() {
	  System.out.println("square of 5 is " +square(5));
  }
}
