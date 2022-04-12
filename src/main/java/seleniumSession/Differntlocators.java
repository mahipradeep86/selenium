package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Differntlocators {
//static WebDriver driver;

	public static void main(String[] args) {
		// 1.id
		//2.name 1st method
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://demo.opencart.com/index.php?route=account/login");
	    // driver.findElement(By.name("email")).sendKeys("smahi86@gmail.com");
	   //  By email=By.name("email");
	   //  By Pass=By.name("password");
	   //  
	   //  Elementutil ele=new Elementutil(driver);
	   //  ele.sendKeys(email, "smahi86@gmail.com");
	  //   ele.sendKeys(Pass, "Hariha#4");
	     //3. by class name
	   //  By email=By.className("form-control");
	 //    driver.findElement(email).sendKeys("smahi86@gmail.com");
	 //4. By x -path
	    // By email=By.xpath("//*[@id=\"input-email\"]");
	    // By pass=By.xpath("//*[@id=\"input-password\"]");
	    // By login=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	  //   
	  //   Elementutil ele=new Elementutil(driver);
	   //  ele.sendKeys(email, "smahi86@gmail.com");
	   //  ele.sendKeys(pass, "s");
	    // driver.findElement(login).click(); or below method 
	 //    ele.click(login);
	     //5.css
	   // By email=By.cssSelector("#input-email");
	//    By  pass=By.cssSelector( "#input-password");
	    
	//     driver.findElement(email).sendKeys("smahi86@gmail.com");
	  //   6.link text: only for links
	    // By registerbut=By.linkText("Register");
	     
	  //  Elementutil ele=new Elementutil(driver);
	   //  ele.click(registerbut);
	     //or 
	   // driver.findElement(registerbut).click();
	     
	     //7.partial link text
	     
	//   By addessbookbut=By.partialLinkText("Book");
	   //  String m=driver.findElement(addessbookbut).getText();
//	     System.out.println(m);
	     
	     //8.tag name( will give text of that particular tag)
	     By tagname=By.tagName("h2");
	     Elementutil ele=new Elementutil(driver);
	    String s= ele.getAlertText(tagname);
	    System.out.println(s);
	   // ele.getelements(linkname);
	     
	   //  String s = driver.findElement(tagname).getText();
	    // System.out.println(s);
	     //By registerbut=By.linkText("Register");
	    //String tx= driver.findElement(registerbut).getText();
	   // System.out.println(tx);
	    
	    
	     
	     
	     
		

	}

}
