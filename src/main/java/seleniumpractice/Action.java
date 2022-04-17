package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	     driver.get("https://www.bigbasket.com/cl/fruits-vegetables/?nc=nb");
	    // WebElement hair= driver.findElement(By.linkText("HAIR CARE"));
	   //  Actions act=new Actions(driver);
	   //  act.moveToElement(hair).perform();
	  //   Thread.sleep(2000);
	  //   driver.findElement(By.linkText("shampoo")).click();
	     By parentmenu=By.linkText("SHOP BY CATEGORY");
	     By childmenu1 =By.linkText("Fruits & Vegetables");
	     By childmenu2=By.linkText("Fresh Vegetables");
	     By childmenu3=By.linkText("Potato, Onion & Tomato");
	     By childmenu4=By.linkText("Vegetables");

	    // By childmenu4=By.linkText("Vegetables");
	     
	     action(parentmenu,childmenu1,childmenu2,childmenu3,childmenu4);
	     

}
	
	public static void action(By parentmenu,By childmenu) throws InterruptedException {
		 Actions act=new Actions(driver);
		    act.moveToElement(driver.findElement(parentmenu)).perform();
		    Thread.sleep(2000);
		    driver.findElement(childmenu).click();
		    
	}
	public static void action(By parentmenu,By childmenu1,By childmenu2) throws InterruptedException {
		 Actions act=new Actions(driver);
		    act.moveToElement(driver.findElement(parentmenu)).perform();
		    Thread.sleep(2000);
		    act.moveToElement(driver.findElement(childmenu1)).perform();
		    Thread.sleep(2000);
		    driver.findElement(childmenu2).click();
		    
	}
	public static void action(By parentmenu,By childmenu1,By childmenu2,By childmenu3) throws InterruptedException {
		 Actions act=new Actions(driver);
		    act.moveToElement(driver.findElement(parentmenu)).perform();
		    Thread.sleep(2000);
		    act.moveToElement(driver.findElement(childmenu1)).perform();
		    Thread.sleep(2000);
		    act.moveToElement(driver.findElement(childmenu2)).perform();
		    Thread.sleep(2000);
		    driver.findElement(childmenu3).click();
		    
	}
	public static void action(By parentmenu,By childmenu1,By childmenu2,By childmenu3,By childmenu4) throws InterruptedException {
		 Actions act=new Actions(driver);
		    act.moveToElement(driver.findElement(parentmenu)).perform();
		    Thread.sleep(2000);
		    act.moveToElement(driver.findElement(childmenu1)).perform();
		    Thread.sleep(2000);
		    act.moveToElement(driver.findElement(childmenu2)).perform();
		    Thread.sleep(2000);
		    act.moveToElement(driver.findElement(childmenu3)).perform();
		    Thread.sleep(2000);
		    driver.findElement(childmenu4).click();
		    
	}
	
		    
	}
	

