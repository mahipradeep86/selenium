package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwait {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	     driver.get("https://demo.opencart.com/index.php?route=account/login");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     driver.findElement(By.id("input-email1")).sendKeys("smahi86@gmail.com");
	     driver.findElement(By.id("input-password")).sendKeys("hariha#4");
	}

}
