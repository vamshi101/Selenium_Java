package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example_DataProvider {
  @Test(dataProvider = "loginData ")
  public void verifyLogin(String username, String password) {
	  System.out.println(username);
	  System.out.println(password);
	  
  }
  @DataProvider
  public Object[][] loginData(){
	  Object[][] data =new Object[4][2];
	  data[0][0]="Suresh";
	  data[0][1]="Suresh@1234";

	  data[0][0]="Rajesh";
	  data[1][1]="Rajesh@1234";
  
	  data[2][0]="Ramesh";
	  data[2][1]="Ramesh@123";

	  data[3][0]="Varun";
	  data[3][1]="Varun@123";

	  return data;
	  
  }
}

//the return type of datatype provider is 2-dimensional array....
//