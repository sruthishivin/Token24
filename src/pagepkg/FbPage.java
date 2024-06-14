package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbPage {
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpswd=By.id("pass");
	By fblogin=By.name("login");
	
	
	public FbPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String Username,String pswd)
	{
		driver.findElement(fbemail).sendKeys(Username);
		driver.findElement(fbpswd).sendKeys(pswd);
	}
	
	
	public void login()
	{
		driver.findElement(fblogin).click();
	}


}
