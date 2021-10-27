package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practive1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\Software\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement acc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		acc.click();
		Thread.sleep(2000);
		WebElement birth=driver.findElement(By.xpath("//select[@id='day']"));
		Select down=new Select(birth);
		down.selectByValue("20");
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select dow=new Select(month);
		dow.selectByValue("June");
	}

}
