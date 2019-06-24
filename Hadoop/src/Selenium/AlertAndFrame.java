package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrame {

	ChromeDriver driver;
	
	public void invokeBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/libs/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.switchTo().frame("iframeResult");
		
		//driver.switchTo().defaultContent();
		
		driver.findElementByTagName("button").click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
	}
}
