package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff2 {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}	
		@Test
		public void test()
		{
			Boolean b=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
			if(b)
			{
				System.out.println("Logo is present");
			}
			else
			{
				System.out.println("Logo is not present");
			}
		Boolean b1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		if(b1)
		{
			System.out.println("Checked");
		}
		else
		{
			System.out.println("Not Checked");
		}
		Boolean b2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(b2)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
	}
}


