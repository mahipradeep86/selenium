package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	public static void main(String[] args) {
		Browserutil br=new Browserutil();
		WebDriver driver= br.launchbrowser("chrome");
		br.launchurl("https://demo.opencart.com/index.php?route=account/login");
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register");
		
	String title=br.getPageTitle();
	System.out.println(title);
	 By email= By.id("input-email");
     By passowrd=By.id("input-password");
     

     Elementutil e =new Elementutil(driver);
     e.doSendKeys(email, "mahi");
     e.doSendKeys(passowrd, "mahi");
     

    
    // br.quit();
     
     

	}
	

}
