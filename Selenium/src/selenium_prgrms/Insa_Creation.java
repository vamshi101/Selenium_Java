package selenium_prgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insa_Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d1= new ChromeDriver();
		
		d1.get("https://www.instagram.com/");
		d1.findElement(By.linkText("Sign up")).click();
		d1.manage().window().maximize();
		
		//d1.findElement(By.id("phone mumber")).sendKeys("123");
		

	}

}
  
