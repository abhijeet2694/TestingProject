package PomClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	@FindBy (xpath="//span[@class='nav-line-2 ']")
	public WebElement account;
	
	@FindBy (xpath="//input[@type='email']")
	public WebElement username;
	
	@FindBy (xpath="//input[@id='continue']")
	public WebElement continu;
	
	@FindBy (xpath="//input[@id='ap_password']")
	public WebElement password;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	public WebElement signin;
	
	@FindBy (xpath="//span[text()='Sign Out']")
	private WebElement signout;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void account() {
		account.click();
	}
	public void username() {
		username.sendKeys("8669050812");
	}
	public void Continue() {
		continu.click();
	}
	public void Password() {
		password.sendKeys("Aat98500");
	}
	public void signIn() {
		signin.click();
	}
	public void Signout(WebDriver driver) throws InterruptedException 
	{
		Actions act=new Actions(driver);
		act.moveToElement(account).perform();
		Thread.sleep(3000);
		//		WebDriverWait wait=new WebDriverWait(driver,10);
//		WebElement check=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign Out']")));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		act.moveToElement(signout).click().build().perform();
		
	}

}
