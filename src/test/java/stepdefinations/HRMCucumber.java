package stepdefinations;

//Cucumber Step definition Common file 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMCucumber {
	public static WebDriver driver = null;

	@Given("browser is open and app is in login page")
	public void browser_is_open_and_app_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/button")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}
	
	@Then("homepage is displayed")
	public void homepage_is_displayed() {
		String actual = null, expected =null;
	    expected="PIM";
	    actual=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
	    SoftAssert soft=new SoftAssert();
	    soft.assertEquals(actual, expected);
	    System.out.println("After Assertion");
	}
	
	@Given("navigated to leave page")
	public void navigated_to_leave_page() {
		driver.findElement(By.xpath("//li[3]")).click();
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab']/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	}
	
	@When("given proper information")
	public void given_proper_information() {
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-09-28");
		driver.findElement(By.xpath("//textarea")).sendKeys("Family Function");
	}
	
	@Then("user can apply for leave")
	public void user_can_apply_for_leave() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Given("navigated to search page")
	public void navigated_to_search_page() {
		driver.findElement(By.xpath("//li[1]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}

	@When("given proper name")
	public void given_proper_name() {
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input")).sendKeys("Paul Collings");
	}

	@Then("employee information can be found")
	public void employee_information_can_be_found() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}


}
