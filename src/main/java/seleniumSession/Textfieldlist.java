package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textfieldlist {
	static WebDriver driver;
	

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	     driver.get("https://demo.opencart.com/index.php?route=account/register");
	    List<WebElement> ele= driver.findElements(By.xpath("//form//input[@type='text'or@type='email'or@type='tel']"));
	    		for(WebElement e: ele) {
	    			
	    			e.sendKeys("mahi");}
	    		
	
}
	}


