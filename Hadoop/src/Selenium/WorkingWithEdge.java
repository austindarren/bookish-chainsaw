package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithEdge {
	EdgeDriver driver;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.edge.driver", "C:/libs/MicrosoftWebDriver.exe");
		
		driver = new EdgeDriver();
		
		Dimension dim = new Dimension(500, 500);
		driver.manage().window().setSize(dim);
		driver.manage().window().maximize();
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
