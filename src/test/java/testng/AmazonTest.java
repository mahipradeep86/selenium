package testng;

//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest extends Basetest {
	
		
   @Test(priority=2)
	public void titleTest()
	{
	  
		String title= driver.getTitle();
		Assert.assertTrue(title.contains("Smile more") );
	}
	
	@Test(priority=1)
	public void urlTest()
	{
		
		 driver.get("https://www.amazon.com/");
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("amazon"));
	}
	
	@Test(priority=3)
	public void SearchTest()
	{
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
	}
	
}
