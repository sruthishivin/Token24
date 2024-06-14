package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPageFactory {
	WebDriver driver;
	@FindBy(id="email")
	WebElement fbemail;
	
	
	@FindBy(id="pass")
	WebElement fbpswd;
	
	@FindBy(name="login")
	WebElement fblogin;

	
	public FbLoginPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setvalues(String email,String password)
	{
		fbemail.sendKeys(email);
		fbpswd.sendKeys(password);
	}
	
	public void login() 
	{
		fblogin.click();
	}
}
