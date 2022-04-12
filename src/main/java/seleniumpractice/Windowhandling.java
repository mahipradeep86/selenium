package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.bigbasket.com/");//parent window
	     String parentwindowid= driver.getWindowHandle();//parent windowid
	     driver.switchTo().newWindow(WindowType.WINDOW);
	  
	    //instagram 
	     driver.get("https://www.instagram.com/bigbasketcom/");
	   
	      Thread.sleep(2000);
	      driver.close();
	      driver.switchTo().window(parentwindowid);
	      Thread.sleep(2000);
	      
	      //twitter
	      driver.switchTo().newWindow(WindowType.WINDOW);
	      driver.get("https://twitter.com/Bigbasket_com");

	      Thread.sleep(2000);
	      driver.close();
	      driver.switchTo().window(parentwindowid);
	      Thread.sleep(2000);
	      
	      //pinterest
	      driver.switchTo().newWindow(WindowType.WINDOW);
	      driver.get("https://in.pinterest.com/bigbasketcom/_created/");
	      Thread.sleep(2000);
	      driver.close();
	      driver.switchTo().window(parentwindowid);
	      Thread.sleep(2000);
	      
	      //facebook
	      driver.switchTo().newWindow(WindowType.WINDOW);
	      driver.get("https://www.facebook.com/Bigbasketcom/");
	      
	      Thread.sleep(2000);
	      driver.close();
	      driver.switchTo().window(parentwindowid);
	      Thread.sleep(1000);
	      driver.close();
	      
	      
	      
	      
		
		
		
		
	}

}
