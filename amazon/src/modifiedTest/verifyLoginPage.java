package modifiedTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyLoginPage {
	WebDriver driver;
	LoginPage loginpage;
	@BeforeClass
	public void login() {
		System.setProperty("webdriver.chrome.driver","F:\\Software testing\\Software\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		loginpage=new LoginPage(driver);
	}
	
	@BeforeMethod
	public void clickOnLogin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test (priority=1)
	public void onLogin() {
		loginpage.account();
	}
	@Test (priority=2)
	public void Username() {
		loginpage.username();
		loginpage.Continue();
	}
	
	@Test (priority=3)
	public void Password() {
		loginpage.Password();
		loginpage.signIn();
	}
	
	@AfterMethod
	public void endLog() {
//		loginpage.account();
//		loginpage.Signout();
		System.out.println("Complete");
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
