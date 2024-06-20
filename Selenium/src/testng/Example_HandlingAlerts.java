package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Example_HandlingAlerts {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;
  @Test
  public void verifyAlerts() {
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  driver.findElement(By.id("alertButton")).click();
	  String text = driver.switchTo().alert().getText();
	  System.out.println("Text1: "+text);
	  driver.switchTo().alert().accept();
	  driver.findElement(By.id("timerAlertButton")).click();
	  wait.until(ExpectedConditions.alertIsPresent());
	  text =driver.switchTo().alert().getText();
	  System.out.println("Text2: "+text);
	  driver.switchTo().alert().accept();
	  driver.findElement(By.id("confirmButton")).click();
	  text = driver.switchTo().alert().getText();
	  System.out.println("Text3: "+text);
	  driver.switchTo().alert().dismiss();
	  driver.findElement(By.id("promtButton")).click();
	  text = driver.switchTo().alert().getText();
	  System.out.println("Text4: "+text);
	  driver.switchTo().alert().sendKeys("Selenium");
	  driver.switchTo().alert().accept();
	  String value = driver.findElement(By.id("promptResult")).getText();
	  if(value.contains("Selenium")) {
		  System.out.println("TEst PAssed...");
	  } else {
		  System.out.println("Test Failed...");
	  }
	  
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  action= new Actions(driver);
	  wait = new WebDriverWait(driver, Duration.ofSeconds(40));
  }

  @AfterTest
  public void afterTest() {
  }

}
