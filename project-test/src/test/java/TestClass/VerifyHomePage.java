package TestClass;

import java.util.concurrent.TimeUnit;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.HomePage;



public class VerifyHomePage {
	WebDriver driver;
	HomePage homepage;
	@BeforeClass
	public void chromeObject(){
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\Software\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		homepage=new HomePage(driver);
	}
	@BeforeMethod
	public void loginAmazon() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.account();
		homepage.username();
		homepage.Continue();
		homepage.Password();
		homepage.signIn();
	}
	
	@Test(priority=1)
	public void mobileRecharge() {
		homepage.amazonPay();
		homepage.recharge();
		homepage.Signout(driver);
	}
	
//	@Test(priority=2)
//	public void electricity() {
//		homepage.amazonPay();
//		homepage.electricity();
//		homepage.Signout(driver);
//	}
//	
//	@AfterMethod
//	public void Signout() throws InterruptedException{
//		
//		homepage.Signout(driver);
//		System.out.println("complete");
//	}
	
	@AfterClass
	public void browserClose() {
		driver.close();
	}
}
