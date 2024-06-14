package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbLoginPage {
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpswd=By.id("pass");
	By fblogin=By.name("login");
	
	
	public FbLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String email,String password)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpswd).sendKeys(password);
	}
	
	
	public void login()
	{
		driver.findElement(fblogin).click();
	}

	
}
