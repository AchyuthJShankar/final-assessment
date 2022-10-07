package alertHandle;
//Code for Prompt Alert

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		//driver.findElement(By.linkText("")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert prompt=driver.switchTo().alert();
		System.out.println(prompt.getText());
		prompt.sendKeys("Achyuth");
		prompt.accept();
		//prompt.dismiss();
		
	}

}
