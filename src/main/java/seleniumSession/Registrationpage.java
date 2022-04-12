package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registrationpage {

	public static void main(String[] args) {
		Browserutil br=new Browserutil();
		WebDriver driver= br.launchbrowser("chrome");
		//br.launchurl("https://demo.opencart.com/index.php?route=account/login");
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register");
		By fn= By.id("input-firstname");
	     By ln= By.id("input-firstname");
	     By email1=By.id("input-email");
	     By phone=By.id("input-telephone");
	     By password=By.id("input-password");
	     By cpassword=By.id("input-confirm");
	     
	     
	     Registrationutil r=new Registrationutil(driver);
	     


	     r.sendKeys1(fn,"mahi");
	     r.sendKeys1(ln,"pradee");
	     r.sendKeys1(email1,"smahi86@gmail.com");
	     r.sendKeys1(phone,"9193445920");
	     r.sendKeys1(password,"Hariha#4");
	     r.sendKeys1(cpassword,"Hariha#4");
	     r.sendKeys1(password, "hariha#4");
	     r.sendKeys1(cpassword, "Hariha#4");
driver.navigate().to("https://demo.opencart.com/index.php?route=account/login");

By email= By.id("input-email");
By passowrd=By.id("input-password");


Elementutil e =new Elementutil(driver);
e.doSendKeys(email, "mahi");
e.doSendKeys(passowrd, "mahi");
	}

}
