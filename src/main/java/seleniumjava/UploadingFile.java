package seleniumjava;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadingFile {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("passtestingcloud@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("welcome!123");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']"))).click();
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();

		// Copy string to clipboard

		String str = "D:\\Cloud foundary\\Stick Notes details.txt";
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection strSel = new StringSelection(str);
		clipboard.setContents(strSel, null);

		// ROBOT Initialization
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_ENTER);
		
		driver.quit();
	}
}
