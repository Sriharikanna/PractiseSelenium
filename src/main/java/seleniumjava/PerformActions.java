package seleniumjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformActions {
	public static void main(String[] args) {
		
		//Initialization
		
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Get URL
		
		driver.get("https://www.amazon.in");
		
		Actions builder = new Actions(driver);		
		WebElement ele = driver.findElementByXPath("//span[text()='Category']");
		builder.moveToElement(ele).build().perform();
	}
}
