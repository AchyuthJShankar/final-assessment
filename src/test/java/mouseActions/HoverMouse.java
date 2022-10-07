package mouseActions;

//Code for Hover mouse action

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		Actions mouse2 = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		mouse2.moveToElement(driver.findElement(By.linkText("JS Foundation"))).build().perform();

	}

}
