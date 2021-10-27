package modifiedTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyAmazonPay {
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
	
	@Test
	public void mobileRecharge() {
		homepage.amazonPay();
		homepage.recharge();
	}
	
	@Test
	public void electricity() {
		homepage.amazonPay();
		homepage.electricity();
	}
	
	@AfterMethod
	public void Signout(){
		homepage.Signout();
	}
	
	@AfterClass
	public void browserClose() {
		driver.close();
	}

}
