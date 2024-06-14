package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {

	ChromeDriver driver;
	@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://www.blazedemo.com/register");
		}
	@Test
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("Sruthi");
		
		driver.findElement(By.name("company")).sendKeys("abc");
		
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Ridhu@123");
		
		driver.findElement(By.name("password_confirmation")).sendKeys("Ridhu@123");
	}
	
}
