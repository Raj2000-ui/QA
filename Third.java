package MyTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Third {
	WebDriver d;
	@BeforeTest
	public void Test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		String expectedTitle = "OrangeHRM";
		String actualTitle = d.getTitle();
		//if(assertEquals(actualTitle, expectedTitle, "Title is Matched")) {
	   		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
	   			  System.out.println("The login is Successfull");
	   		}
	   		else {
	   			System.out.println("The Login is Failed");
	   		}
	}

	
	@Test(dataProvider="DP")
	public void user1(String username, String password) {
		d.findElement(By.id("txtUsername")).sendKeys(username);
		d.findElement(By.id("txtPassword")).sendKeys(password);
		d.findElement(By.id("btnLogin")).click();
	}
	
	@DataProvider(name="DP")
	public Object[][] datObject(){
		return new Object[][] {
			{"kin", "admin123"},{"lokesh", "junit"},{"amit","selenium"},{"Admin","admin123"}
		};
	}

}
