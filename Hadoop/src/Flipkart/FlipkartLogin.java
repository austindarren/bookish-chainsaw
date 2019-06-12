package Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartLogin {
	
	ChromeDriver driver;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:/libs/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				driver.get("https://www.flipkart.com/");
		
	}
	
	public void CloseModal() {
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	}
	
	public void ClickCategory() {
		
		WebElement cat = driver.findElement(By.xpath("//*[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Electronics')]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(cat).build().perform();
		
		WebElement apple = driver.findElement(By.xpath("//a[text()='Apple Products']"));
		
		waitTillElementVisible(10,By.xpath("//a[text()='Apple Products']"));
		
		
		action.moveToElement(apple).click().build().perform();
		
		
	}
	
private void waitTillElementVisible(int timeOutInSeconds, By locator ) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	


public void enterSearchText(String product) {
	
	
	driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys(product);
	
	driver.findElement(By.xpath("//*[@class='vh79eN']")).click();
	
	Actions act = new Actions(driver);
	
	act.moveToElement(null).build().perform();
	
}


}
