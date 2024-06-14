package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	
	public void test()
	{
		driver.manage().window().maximize();
		//from parent to child locate
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();
	}
}
