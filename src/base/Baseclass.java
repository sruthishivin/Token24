package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	  WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}

	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}

}
