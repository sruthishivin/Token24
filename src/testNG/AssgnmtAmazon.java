package testNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssgnmtAmazon {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		String parent=driver.getWindowHandle();
		System.out.println("Parent window Title " +driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("mobile phones",Keys.ENTER);
		
		//getting the title
		
		String actual=driver.getTitle();
		String expect="Amazon.in : mobile phones";
		Assert.assertEquals(expect, actual);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String> child=driver.getWindowHandles();
		for(String handle:child)
		{
		System.out.println(driver.getTitle());
		if(!handle.equalsIgnoreCase(parent))
		{
		driver.switchTo().window(handle);
		driver.navigate().refresh();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
		driver.navigate().forward();
		driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();

		driver.close();
		}

		driver.switchTo().window(parent);
		}
		
		
	}
}
