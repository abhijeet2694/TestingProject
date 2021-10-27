package amazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	
//	WebDriverWait wait=new WebDriverWait(driver,10);
//	WebElement check=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	
	@FindBy (xpath="//span[text()='Sign in']")
	private WebElement AccountList;
	
	@FindBy (xpath="//input[@type='email']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement Continue;
	
	@FindBy (xpath="//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement signin;
	
	@FindBy (xpath="//span[text()='Sign Out']")
	private WebElement signout;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void accountList() 
	{
		
		
		AccountList.click();
	}
	
	public void UserName()
	{
		userName.sendKeys("8669050812");
	}
	
	public void COntinue() 
	{
		Continue.click();
	}
	
	public void Password() 
	{
		password.sendKeys("Aat98500");
	}
	
	public void Signin() 
	{
		signin.click();
	}
	
	public void Signout() 
	{
		signout.click();
	}
	

}
