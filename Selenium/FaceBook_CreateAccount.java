package pckg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_CreateAccount {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FaceBook_CreateAccount f1 = new FaceBook_CreateAccount();
		f1.setup();
		f1.createAccount();
		//f1.closeDriver();
	}
	
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	public void createAccount() throws InterruptedException {
		driver.findElement(By.linkText("Create new account")).click();		
		
		driver.findElement(By.name("firstname")).sendKeys("Suresh");
		driver.findElement(By.name("lastname")).sendKeys("Podugu");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543211");
		driver.findElement(By.id("password_step_input")).sendKeys("Suresh@123");
		new Select(driver.findElement(By.id("day"))).selectByIndex(9);
//		new Select(driver.findElement(By.id("day"))).selectByValue("15");
//		new Select(driver.findElement(By.id("day"))).selectByVisibleText("20");
		new Select(driver.findElement(By.id("month"))).selectByValue("7");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2000");
		driver.findElement(By.xpath("//input[@name='sex']/preceding-sibling::label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}
	
	public void closeDriver() {
		driver.quit();
	}

}
