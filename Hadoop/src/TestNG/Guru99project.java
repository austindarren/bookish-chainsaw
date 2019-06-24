package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99project {
	ChromeDriver driver;

	@BeforeClass
	public void invokeBrowser() {
System.setProperty("webdriver.chrome.driver", "C:/libs/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4");
		
	}
	
	@Test
	public void getPageTitle() {
		String title = driver.getTitle();
		
		//System.out.println(title);
		Assert.assertEquals(title, "title");
		
	}
	@Parameters({"userid","pass"})
	@Test
	public void login(String userid, String pass) {
		
		//String userid ="mngr188002";
		//String pass="hehYryr";
		
		WebElement userIdElement;
		
		userIdElement = driver.findElement(By.name("uid"));
		
		userIdElement.sendKeys(userid);
		
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("btnLogin")).click();
				
	}
	
	@AfterClass
	public void close() {
		
		driver.quit();
	}

}
