package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplyLeaveHRM {
	public static WebDriver driver = null;
	@BeforeTest 
	  public void login() {
		  	System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/button")).click();
	  }
	@Test
	  public void leaveApp() {
			driver.findElement(By.xpath("//li[3]")).click();
			driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab']/a[1]")).click();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
			driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
			driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-10-11");
			driver.findElement(By.xpath("//textarea")).sendKeys("Family Function");
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	  }
}