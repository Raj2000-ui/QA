package MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Fifth1 {
	WebDriver d;
	public void Test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		String expectedTitle = "OrangeHRM";
		String actualTitle = d.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	}
