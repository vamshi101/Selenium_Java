package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example_RegisterUsingDataProvider {
	@Test(dataProviderClass = DataProvider.class,  dataProvider = "registerData")
	public void verifyRegisterAccount(String fName, String lName, long phNo, String email) {
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(phNo);
		System.out.println(email);
	}
}