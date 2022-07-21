package MyTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sugarcrm {
	WebDriver d;
	@BeforeTest
	public void Test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://open-source-guide.com/");
		Thread.sleep(1000);
		}
	
	@Test
	public void Test4() throws InterruptedException {
		d.findElement(By.xpath("//*[@id=\"nav\"]/div/ul/li[4]/a")).click();
		Thread.sleep(1000);
		 List<WebElement> links = d.findElements(By.tagName("a"));
	      System.out.println("The number of links is "+ links.size());
	
	}
}


