package seleniumjava;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://irctc.co.in");
		//driver.findElementById("loginbutton").click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		// Un-handled Alert exception
		// driver.findElementByName("j_username").sendKeys("Srihari");
	}
}
