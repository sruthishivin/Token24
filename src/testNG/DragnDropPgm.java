package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragnDropPgm {
	WebDriver driver;
	@BeforeTest
	public void set() 
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dragged=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, dragged);
		act.build().perform();
		String s=dragged.getText();
		if(s.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}
