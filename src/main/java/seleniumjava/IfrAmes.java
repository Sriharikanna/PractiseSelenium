package seleniumjava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfrAmes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		List<WebElement> frames = driver.findElementsByTagName("iframe");
		System.out.println("No of frames Available :" + frames.size());
		WebElement frame1 = driver.findElementByTagName("iframe");
		try {
			driver.switchTo().frame(frame1);
			driver.findElementById("Click").click();
			System.out.println("The button is clicked");
			driver.findElement(By.tagName("iframe"));
			//driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.findElementById("Click1").click();
			System.out.println("The button is clicked inside nested frame");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}
}
