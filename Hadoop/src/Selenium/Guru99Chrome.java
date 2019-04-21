package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Chrome {
	ChromeDriver driver;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:/libs/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4");
		
	}
	
	public void printTitleOfThePage() {
		
		String titleOfThePage = driver.getTitle();
		
		System.out.println("titleOfThePage: " +titleOfThePage);
	}
	
public void login(String userid,String pass) {
	
	WebElement userIdElement;
	
	userIdElement = driver.findElement(By.name("uid"));
	
	userIdElement.sendKeys(userid);
	
	driver.findElement(By.name("password")).sendKeys(pass);
	driver.findElement(By.name("btnLogin")).click();
			
			
	
}

public void newCustomer() {
	
	driver.findElementByLinkText("New Customer").click();
	driver.findElementByName("name").sendKeys("jahnavi");
	driver.findElement(By.xpath("//input[@value='f']")).click();
	driver.findElementByName("dob").sendKeys("15/11/1988");
	driver.findElementByName("addr").sendKeys("Sydney Australia");
	driver.findElementByName("city").sendKeys("Sydney");
	driver.findElementByName("state").sendKeys("NSW");
	driver.findElementByName("pinno").sendKeys("234211");
	driver.findElementByName("telephoneno").sendKeys("0415440990");
	String emailId = "jahn" + System.currentTimeMillis() + "gmail.com";
	driver.findElementByName("emailid").sendKeys(emailId);
	driver.findElementByName("password").sendKeys("abc");
	driver.findElementByName("sub").click();
} 
}