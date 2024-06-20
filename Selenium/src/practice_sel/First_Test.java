package practice_sel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class First_Test {
	WebDriver driver;
  @Test
  public void verifySignup() {
	  driver.findElement(By.linkText("Sign up")).click();
	
	  
  }

	  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.instagram.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
