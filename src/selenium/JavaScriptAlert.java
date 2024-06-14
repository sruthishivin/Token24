package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Alert a=driver.switchTo().alert();
		String actual=a.getText();
		String expect="I am a JS Alert";
		if(actual.equals(expect))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		a.accept();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert a1=driver.switchTo().alert();
		String actual1=a1.getText();
		String expect1="I am a JS Confirm";
		if(actual1.equals(expect1))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		//a1.accept();
		a1.dismiss();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert a2=driver.switchTo().alert();
		String actual2=a2.getText();
		String expect2="I am a JS prompt";
		if(actual2.equals(expect2))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		a2.sendKeys("hai");
		a2.accept();
		
		
	}
}
