package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fourth {
WebDriver drv;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\web drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		drv = new ChromeDriver();
		drv.get("https://opensource-demo.orangehrmlive.com");
		drv.manage().window().maximize();
		drv.manage().deleteAllCookies();
	}
	
	@Test
	@Parameters( {"username", "password"})
	public void start(String username, String password) throws InterruptedException {
		
		WebElement usernameField = drv.findElement(By.id("txtUsername"));
		WebElement passwordField = drv.findElement(By.id("txtPassword"));
		WebElement submit = drv.findElement(By.name("Submit"));
		
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		submit.click();
		Thread.sleep(2000);
		
		drv.close();
	}
	


}
