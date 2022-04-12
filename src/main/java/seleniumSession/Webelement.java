package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelement {
	
	static WebDriver driver;
	public static void main(String[] args)

	 {
		 WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	     driver.get("https://demo.opencart.com/index.php?route=account/login");
  // 1. driver.findElement(By.id("input-email")).sendKeys("smahi86@gmail.com");
   //driver.findElement(By.id("input-password")).sendKeys("hariha#4");
     
   //2. WebElement emailid =driver.findElement(By.id("input-email"));
   //  WebElement password = driver.findElement(By.id("input-password"));
     
    //emailid.sendKeys("smahi86@gmail.com");
   // password.sendKeys("Hariha#4");
    
   // By email= By.id("input-email");
 //By passowrd=By.id("input-password");
// driver.findElement(email).sendKeys("smah86@gmail.com");
// driver.findElement(passowrd).sendKeys("Hariha34");
     By email= By.id("input-email");
     By passowrd=By.id("input-password");
     Elementutil e=new Elementutil(driver);
     e.sendKeys(email, "mahi");
     e.sendKeys(passowrd, "mahi");
     
    
	}

	
	
	
}
