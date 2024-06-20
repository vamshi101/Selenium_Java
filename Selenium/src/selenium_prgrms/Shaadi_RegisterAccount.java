package selenium_prgrms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shaadi_RegisterAccount {
	WebDriver driver;
	Actions action ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shaadi_RegisterAccount s1 = new Shaadi_RegisterAccount();
		s1.setUp("https://shaadi.com");
		s1.registerShaadi();
	}
	
	public void setUp(String url) {
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		action = new Actions(driver);
	}
	
	public void quitDriver() {
		driver.quit();
	}
	
	public void registerShaadi() {
		driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div//div[contains(@class, 'is-selected')]")).click();
		driver.findElement(By.xpath("//div[text()='Woman' and @role='option']")).click();
		driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div/div[contains(@class, 'ageFrom')]/div/div/div[1]")).click();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//div[text()='25']")).click();
		driver.findElement(By.xpath("//div[contains(@class, 'ageUpto')]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='30']")).click();
		//action.sendKeys(Keys.PAGE_UP).build().perform();
		driver.findElement(By.xpath("//label[text()='of religion']/following-sibling::div//div[contains(@class, 'is-selected')]")).click();
		driver.findElement(By.xpath("//div[text()='Hindu']")).click();
		driver.findElement(By.xpath("//label[text()='and mother tongue']/following-sibling::div//div[contains(@class, 'is-selected')]")).click();
		driver.findElement(By.xpath("//div[text()='More']/following-sibling::div[text()='Telugu']")).click();
		driver.findElement(By.xpath("//button[@data-testid='lets_begin']")).click();
		
		
	}

	

}
