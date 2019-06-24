package SeleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartWait {
	
	ChromeDriver driver;
	public void invokeBrowser() {

	
	
	System.setProperty("webdriver.chrome.driver", "C:/libs/chromedriver.exe");
	
	 driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	driver.get("https://www.flipkart.com/");
	
	
	}
	
	public void mouseHover() {
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	WebElement electronicslink = driver.findElement(By.xpath("//span[text()='Electronics']"));
	
	
	Actions action = new Actions(driver);
	
	action.moveToElement(electronicslink).build().perform();
	
	WebElement samsunglink = driver.findElement(By.xpath("(//a[text()='Samsung'])[1]"));
	
	waitTillElementVisible(10,By.xpath("(//a[text()='Samsung'])[1]"));
	
	action.moveToElement(samsunglink).click().build().perform();
	
	}
	
	//explicit wait
	private void waitTillElementVisible(int timeOutInSeconds, By locator ) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	

}
