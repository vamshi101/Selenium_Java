package selePrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstClass {
	
	   
  @Test(priority=1)
  public void test2() {
	  System.out.println("Test2 Method");
  }
  
  @Test(priority=2)
  public void test1() {
	  System.out.println("Test1 Method");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }
  
 @BeforeClass
 public void beforeClass() {
	 System.out.println("Before Class");
 }
 
 @AfterClass
 public void afterClass() {
	 System.out.println("After Class");
 }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test1");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("After Test1");
  }
}
