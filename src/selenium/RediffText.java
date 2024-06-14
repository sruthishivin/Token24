package selenium;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffText {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		
			WebElement actualtext=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
			String text=actualtext.getAttribute("value");
			String expec="Create my account >>";
			if(text.equals(expec))
			{
				System.out.println("pass");
				
			}
			else
			{
				System.out.println("fail");
			}
	}

}
