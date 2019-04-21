package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MercuryTravelsChrome {
 String username;
 String pass;
 	ChromeDriver cd1;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:/libs/chromedriver_win32/chromedriver.exe");
		
		cd1 = new ChromeDriver();
		
		cd1.manage().deleteAllCookies();
		cd1.manage().window().maximize();
		cd1.get("https://www.mercurytravels.co.in");
		
}
	
	public void login(String username, String pass) {
	
		this.username = username;
		this.pass = pass;
		
		//System.out.println(username);
		//System.out.println(pass);
		Actions action = new Actions(cd1);
		WebElement element = cd1.findElementByLinkText("Customer Login");
		action.moveToElement(element).perform();
		
		
		
		cd1.findElementByPartialLinkText("User").click();
		
		cd1.findElementById("sign_user_email").sendKeys(username);
		cd1.findElementById("sign_user_password").sendKeys(pass);
		cd1.findElementByClassName("btn btn-lg btn-primary modal-btn ajax-submit").click();
		
	}
}

