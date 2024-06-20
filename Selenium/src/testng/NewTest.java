package testng;

import org.testng.annotations.Test;

public class NewTest {
 @Test(dataProvider = "loginData ")
	  public void verifyLogin(String username, String password) {
		  System.out.println(username);
		  System.out.println(password);
		  
 	}
}
