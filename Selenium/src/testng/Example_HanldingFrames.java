package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Example_HanldingFrames {
	WebDriver driver;
  @Test
  public void verifyFrames() {
	  driver.findElement(By.xpath("//a[text()='Draggable']")).click();
	  driver.switchTo().frame(0);
	  String text = driver.findElement(By.xpath("//div[@id='draggable']")).getText();
	  System.out.println("TEXT1: "+text);
	  driver.switchTo().parentFrame();
	  driver.findElement(By.xpath("//a[text()='Droppable']")).click();
	  driver.switchTo().frame(0);
	  text = driver.findElement(By.id("draggable")).getText();
	  System.out.println("TEXT2: "+text);
	  driver.switchTo().defaultContent();
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
