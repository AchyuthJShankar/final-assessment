package alertHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Achyuth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		//driver.findElement(By.linkText("")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert confirm=driver.switchTo().alert();
		System.out.println(confirm.getText());
		//confirm.accept();
		confirm.dismiss();

	}

}
