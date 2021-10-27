package amazonTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyLoginFunctionality {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\Software\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.accountList();
		loginPage.UserName();
		loginPage.COntinue();
		loginPage.Password();
		loginPage.Signin();
		
		//driver.close();
		
	}

}
