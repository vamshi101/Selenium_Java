package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Example_HandlingMultipleWindows {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;
  @Test
  public void verifyMultipleTabs() throws Exception {
	  
	  String mwindId = driver.getWindowHandle();
	  System.out.println("MWINDID: "+mwindId);
	  driver.findElement(By.xpath("//a/strong[text()='Signup']")).click();
	  Set<String> windIDs =  driver.getWindowHandles();
	  System.out.println("WINDSIDS: "+windIDs);
	  String childWind1 = null;
	  for (String wind : windIDs) {
		if(!wind.equals(mwindId)) {
			childWind1 = wind;
		}
	}
	
	  driver.switchTo().window(childWind1);
	  driver.findElement(By.id("inputFirstName")).sendKeys("James");
	  driver.findElement(By.id("inputLastName")).sendKeys("Bond");
	  driver.switchTo().window(mwindId);
	  driver.findElement(By.xpath("//li/a[text()='Demo']")).click();
	  driver.findElement(By.name("first_name")).sendKeys("Suresh");
	  driver.findElement(By.name("last_name")).sendKeys("Podugu");
	  driver.findElement(By.xpath("//a/strong[text()='Login']")).click();
	  
	  windIDs = driver.getWindowHandles();
	  String childWind2 = null; 
	  for (String windId : windIDs) {
		if(!windId.equals(mwindId)|| !windId.equals(childWind1)) {
			childWind2 = windId;
		}
	}
	  driver.switchTo().window(childWind2);
	  driver.findElement(By.id("inputEmail")).sendKeys("Ramesh@gmail.com");
	  driver.findElement(By.id("inputPassword")).sendKeys("Ramesh@1234");
	  driver.switchTo().window(childWind1);
	  driver.findElement(By.id("inputEmail")).sendKeys("jamesbond@gmail.com");
	  driver.findElement(By.id("inputPhone")).sendKeys("9876543211");
	  driver.findElement(By.id("inputEmail")).click();
	  driver.findElement(By.id("inputEmail")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
	  driver.findElement(By.id("inputEmail")).sendKeys(Keys.chord(Keys.CONTROL, "c"));
	  driver.findElement(By.id("inputCompanyName")).click();
	  driver.findElement(By.id("inputCompanyName")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	  driver.findElement(By.id("inputAddress1")).sendKeys("Ameerpet");
	  Thread.sleep(2000);
	  driver.close();
	  System.out.println("Driver After Close Method: "+driver);
	  driver.switchTo().window(mwindId);
	  driver.findElement(By.name("business_name")).sendKeys("Quality Thought");
	  Thread.sleep(2000);
	  driver.quit();
	  System.out.println("Driver after Quit Method: "+driver);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://phptravels.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  action= new Actions(driver);
	  wait = new WebDriverWait(driver, Duration.ofSeconds(40));
  }

  @AfterTest
  public void afterTest() {
  }

}
