package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContextClick {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test() throws Exception
	{
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(right);
		act.build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		Alert a=driver.switchTo().alert();
		String actual=a.getText();
		String expect="clicked: edit";
		if(actual.equals(expect))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		a.accept();
		Thread.sleep(5000);
		
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick);
		act.build().perform();
		Alert a1=driver.switchTo().alert();
		String actual1=a.getText();
		String expect1="You double clicked me.. Thank You..";
		if(actual1.equals(expect1))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		a1.accept();
		
	}
}
