package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("file:///D:/html/Design.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		
		//driver.switchTo().alert().accept();//switching to alert page
		
		//for handling multiple access we need to use an interface Alert
		
		Alert a	=driver.switchTo().alert();
		String actual=a.getText();
		String expect="Hello!Iam an alert box";
		if(actual.equals(expect))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("sruthi");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("s");
	}
}
