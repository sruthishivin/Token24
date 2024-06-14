package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXPath {
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
		//absolute Xpath
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div/div[1]/input")).sendKeys("sruthi@yahoo.com");
		
		//Relative Xpath
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Maalu@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Maalu@123");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	
}
