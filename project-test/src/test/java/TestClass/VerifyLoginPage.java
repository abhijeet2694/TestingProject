package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.LoginPage;



public class VerifyLoginPage {
	private WebDriver driver;
	private LoginPage loginpage;
	@BeforeClass
	public void login() {
		System.setProperty("webdriver.chrome.driver","F:\\Software testing\\Software\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		loginpage=new LoginPage(driver);
	}
	
//	@BeforeMethod
//	public void clickOnLogin() {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//	}
	@Test (priority=1)
	public void onLogin() throws InterruptedException {
		loginpage.account();
		loginpage.username();
		loginpage.Continue();
		loginpage.Password();
		loginpage.signIn();
		Thread.sleep(3000);
		loginpage.Signout(driver);
	}
//	@Test (priority=2)
//	public void Username() {
//		loginpage.username();
//		loginpage.Continue();
//	}
	
//	@Test (priority=3)
//	public void Password() {
//		loginpage.Password();
//		loginpage.signIn();
//	}
	
//	@AfterMethod
//	public void endLog() {
//		loginpage.Signout();
//		System.out.println("Complete");
//	}
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
