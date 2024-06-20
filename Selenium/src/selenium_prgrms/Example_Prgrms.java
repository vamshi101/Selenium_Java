package selenium_prgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Example_Prgrms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F"); 
		driver.manage().window().maximize();	
		//driver.findElement(By.id("email")).sendKeys("Vickky@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("Vickky@100");
		//driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.linkText("Create new account")).click();
		//driver.findElement(By.name("firstname")).sendKeys("Vickky");
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vamshi");
		driver.findElement(By.name("lastname")).sendKeys("vickky");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");
		//driver.findElement(By.name("birthday_day")).sendKeys("14");
		
		new Select(driver.findElement(By.id("day"))).selectByIndex(14);
		//driver.findElement(By.name("birthday_month")).sendKeys("April");
		new Select(driver.findElement(By.id("month"))).selectByValue("4");
		driver.findElement(By.name("birthday_year")).sendKeys("1999"); 
		
	}

}


//from given array print pair of elements whose sum =n, avoiding duplicates.
//			{0,1,2,3,4,5,6,7,8,9,10} N=0