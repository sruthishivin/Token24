package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FbLoginPage;

public class FbLoginTest {
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
		FbLoginPage fb=new FbLoginPage(driver);
		fb.setvalues("sruthi@gmail.com", "sruthi@123");
		fb.login();
	}
}
