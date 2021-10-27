package PomClasses;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
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
	
	@FindBy(xpath="//a[text()='Amazon Pay']")
	public WebElement amazonpay;
	
	@FindBy(xpath="//span[text()='Mobile Recharge']")
	public WebElement mobilerecharge;
	
	@FindBy(xpath="//span[text()='Electricity']")
	public WebElement electricity;
	
	@FindBy(xpath = "/span[text()='Sign Out']")
	public WebElement signout;
	
	public HomePage(WebDriver driver){
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
	public void amazonPay() {
		amazonpay.click();
	}
	public void recharge() {
		mobilerecharge.click();
	}
	public void electricity() {
		electricity.click();
	}
	public void Signout(WebDriver driver) 
	{
		Actions act=new Actions(driver);
		act.moveToElement(account).perform();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		act.moveToElement(signout).click().build().perform();
	}

}
