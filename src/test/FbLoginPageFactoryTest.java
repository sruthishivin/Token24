package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FbLoginPageFactory;

public class FbLoginPageFactoryTest {
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

	@Test
	public void test()
	{
		FbLoginPageFactory fb=new FbLoginPageFactory(driver);
		fb.setvalues("abc@gmail.com", "abc@123");
		fb.login();
	}
}
