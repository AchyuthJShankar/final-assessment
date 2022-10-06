package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EmployeeSearchHRM {
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
	public void employeeSearch() {
		driver.findElement(By.xpath("//li[1]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input")).sendKeys("Paul Collings");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
