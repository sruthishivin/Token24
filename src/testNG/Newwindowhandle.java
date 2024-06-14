package testNG;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.jar.asm.Handle;

public class Newwindowhandle {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php/");
	}
	@Test
	public void test1()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		String prwndw=driver.getWindowHandle();
		System.out.println("Parent window Title " +driver.getTitle());
		//System.out.println("Parent window Title " +driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> alwndw=driver.getWindowHandles();
		for(String handle:alwndw)
		{
			System.out.println(handle);
		
		
		if(!handle.equalsIgnoreCase(prwndw))
			
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("sruthi123@gmail.com");
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
			driver.close();
		}
		
		driver.switchTo().window(prwndw);
		}
		
		//WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
		//WebDriver driver=driver.switchTo().newWindow(WindowType.WINDOW);
		//driver1.get("https://www.google.com");
		//driver1.close();
	}

}
