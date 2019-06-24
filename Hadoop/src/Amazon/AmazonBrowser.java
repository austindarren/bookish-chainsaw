package Amazon;

import java.util.List;
import java.util.Locale.Category;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonBrowser {

ChromeDriver driver;

public void invokeBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "C:/libs/chromedriver.exe");
	
	driver = new ChromeDriver();
	
	
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.com.au");
	
}

	public void searchDropDown(String product, String category) {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select selectDropDown = new Select(dropdown);
		
		selectDropDown.selectByVisibleText(category);
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
				
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText());
	}
	
	
	public String getProductName(int productNumber) {
		
		String productXpath = String.format("//div[@class='s-result-list s-search-results sg-row']/div[@data-index ='%d']", productNumber);
		
		return driver.findElement(By.xpath(productXpath)).getText(); 
		
	}
	
	public void getAllProducts() {
		
		List<WebElement> allProduct =driver.findElements(By.xpath("//div[@class='s-result-list s-search-results sg-row']/div"));
		
		for(WebElement product:allProduct){
			
			System.out.println(product.getText());
			
			System.out.println("-----------------------------------------------------------------");
			
			
		}
		
		
		
	}

}
