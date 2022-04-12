package seleniumpractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesugg {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	     driver.get("https://www.google.com/");
	     driver.findElement(By.name("q")).sendKeys("naveen automation");
	    Thread.sleep(2000);
	   List<WebElement> sugglist = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]//span"));
	    for(WebElement e: sugglist) {
	     String text=e.getText();
	    	System.out.println(text);
	     //String text;
		if(text.contains("udemy"))
				 {
	    		 e.click();
	    		// break;
				 }
	    		
		
	    	 }
	    	  
	    // }
	     
	//  By search =   By.name("q");
	//By searchlist=  By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span");
	     
	//sendkeys(search,"naveen automation labs");
	// sugglist(search,searchlist,"udemy");
	//}
	
	
	// public static WebElement  getelement(By locator) {
    	// return driver.findElement(locator);
     //}
	 
	 
	// public static List<WebElement> getelements(By locator) {
	//	return driver.findElements(locator);
   //  }
	 //public static void sugglist(By locator,By locator1, String value)  {
	//	 getelement(locator);
		// List <WebElement> sugg= driver.findElements(locator1);
		// List <String> suggop =new ArrayList<String>();
		// Thread.sleep(2000);
		 //for(WebElement e: sugg) {
			 //String tex=e.getText();
			 //System.out.println(tex);
			//if(tex.contains(value)) {
			// e.click();
				//break;
			// }
			 
		 }
     }
	 
	// public static void sendkeys(By locator,String value) {
			//getelement(locator).sendKeys(value);}
	 
//}


