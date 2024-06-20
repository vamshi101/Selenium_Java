package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Example_FileUpload {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;
  @Test
  public void verifyFileUpload() {
	  driver.findElement(By.xpath("//span[contains(text(), 'Choose WORD file')]")).click();
	  driver.findElement(By.xpath("//input[@class='file-upload-input' and @type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\Java_Document.docx");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://www.freepdfconvert.com/word-to-pdf");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  action= new Actions(driver);
	  wait = new WebDriverWait(driver, Duration.ofSeconds(40));
  }

  @AfterTest
  public void afterTest() {
  }

}
