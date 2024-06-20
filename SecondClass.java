package selePrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondClass {
  @Test
  public void test3() {
	  System.out.println("Test3 method");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test2");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("After Test2");
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
	 System.out.println("Before Class1");
 }
 
 @AfterClass
 public void afterClass() {
	 System.out.println("After Class1");
 }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }
  
}
