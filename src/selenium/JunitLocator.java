package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitLocator {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test()
	{
		//to locate webelements search and type selenium and enter
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		//locating search button and click
		//driver.findElement(By.name("btnK")).click();
	}
}
