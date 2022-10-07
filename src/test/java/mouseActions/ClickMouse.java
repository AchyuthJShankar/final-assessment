package mouseActions;

//Code for Click mouse Action

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions mouse1 = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		mouse1.click(driver.findElement(By.xpath("//ol/li[1]"))).build().perform();
		mouse1.click(driver.findElement(By.xpath("//ol/li[2]"))).build().perform();
		mouse1.click(driver.findElement(By.xpath("//ol/li[3]"))).build().perform();
		mouse1.click(driver.findElement(By.xpath("//ol/li[4]"))).build().perform();
		mouse1.click(driver.findElement(By.xpath("//ol/li[5]"))).build().perform();
		mouse1.click(driver.findElement(By.xpath("//ol/li[6]"))).build().perform();
		mouse1.click(driver.findElement(By.xpath("//ol/li[7]"))).build().perform();

	}

}
