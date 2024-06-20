package pckg1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OutLook_CreateAccount {
	WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutLook_CreateAccount a1=new OutLook_CreateAccount();
		a1.setup();
		a1.createAccount();
	}
	public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.microsoft.com/en-in/microsoft-365/outlook/email-and-calendar-software-microsoft-outlook");
	driver.manage().window().maximize();
}
	public void createAccount() {

	}
}
