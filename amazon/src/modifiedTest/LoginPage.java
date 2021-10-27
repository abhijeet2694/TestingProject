package modifiedTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
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
	public void Signout() 
	{
		signout.click();
	}

}
