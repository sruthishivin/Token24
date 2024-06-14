package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("sruthissridhar@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("Maalu23");
		driver.findElement(By.name("login")).click();
		System.out.println("pass");
	}

}
