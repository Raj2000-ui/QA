package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstAndSecond {
	WebDriver d;
	@BeforeTest
	public void Test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		}
	
	/*@Test
	public void Test2() throws InterruptedException {
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(1000);
		d.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(1000);
		d.findElement(By.id("btnLogin")).click();
	}*/
	
	@Test(dataProvider="DP")
	public void user1(String username, String password) throws InterruptedException {
		d.findElement(By.id("txtUsername")).sendKeys(username);
		Thread.sleep(1000);
		d.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(1000);
		d.findElement(By.id("btnLogin")).click();
		d.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		Thread.sleep(2000);
		d.findElement(By.id("menu_dashboard_index")).click();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void Test4() throws InterruptedException {
		d.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(1000);
		d.findElement(By.id("menu_admin_nationality")).click();
		Thread.sleep(2000);
		d.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);
		d.findElement(By.id("nationality_name")).sendKeys("Afghan12345");
		Thread.sleep(2000);
		d.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(3000);
		d.findElement(By.partialLinkText("Logout")).click();
	}
	
	@DataProvider(name="DP")
	public Object[][] datObject(){
		return new Object[][] {
			{"kin", "admin123"},{"lokesh", "junit"},{"raj","selenium"},{"Admin","admin123"}
		};
	}
}
	
	