package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	ChromeDriver driver;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:/libs/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		Dimension dim = new Dimension(500, 500);
		driver.manage().window().setSize(dim);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://qatechhub.com");
		
	}
	
	public void printTitleOfThePage() {
		
		String titleOfThePage = driver.getTitle();
		
		System.out.println("titleOfThePage: " +titleOfThePage);
	}
	
	public void navigateCommands() {
		
		driver.navigate().to("https://facebook.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
				
	}
	
	public void closeWindow() {
		
		//driver.close();
		
		driver.quit();
	}

} 
