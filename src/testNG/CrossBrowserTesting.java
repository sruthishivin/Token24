package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	
	public void set(String browser)
	{
		if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
	}
	
	@Test
	public void fb()
	{
		driver.get("http://www.facebook.com");
	}

}
