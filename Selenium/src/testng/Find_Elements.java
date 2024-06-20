package testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Find_Elements {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;
	
  @Test(priority=1)
  public void verifyTotalLinksOnPage() {
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  int totallinks = links.size();
	  System.out.println("Total number of links on the page:" + totallinks);
  }
  @Test(priority=2)
  public void verifyTotalLinksOnFooter() {
	  WebElement footerSection=driver.findElement(By.id("glbfooter"));
	  List<WebElement> footerLinks = footerSection.findElements(By.tagName("a"));
	  int footerLinksCount = footerLinks.size();
	  System.out.println("total number of FooterLinks:"+footerLinksCount);
  }
  @Test(priority=3)
	  public void VerifyFooterColumnLinks() {
	  WebElement columnSection = driver.findElement(By.xpath("//div[@id='gf-BIG']/table//td[2]"));
	  List<WebElement> columnLinks=columnSection.findElements(By.tagName("a"));
	  int columnLinksCount = columnLinks.size();
	  System.out.println("Total column Links:" +columnLinksCount);
	  System.out.println("******************"
	  		+ "********************");
	  for (int i = 0; i < columnLinks.size(); i++) {
		String linkText = columnLinks.get(i).getText();
		System.out.println(linkText);
	}
	  for (WebElement ele : columnLinks) {
		String text = ele.getText();
		if(text.contains("developers")) {
			ele.click();
			break;
		}
	}
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='logo']")));
	  String text = driver.findElement(By.xpath("//img[@class='logo']")).getAttribute("alt");
	  if(text.contains("Developers Program")) {
		  System.out.println("Logo is Verified Successfully..........");
	  }else {
		  System.out.println("Faild to verify Developers logo...");
	  }
	  
	  String title = driver.getTitle();
	  System.out.println("PAGE TITLE  ");
	  
			  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  action= new Actions(driver);
	  wait = new WebDriverWait(driver, Duration.ofSeconds(40));
}
}
