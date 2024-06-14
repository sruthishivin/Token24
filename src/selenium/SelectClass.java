package selenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
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
		driver.manage().window().maximize();
		
		//selecting date
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		//creating object for an predefined class select 
		Select day=new Select(dayelement);
		day.selectByValue("25");
	    List<WebElement> d=day.getOptions();//to get count dropdownlist
		System.out.println("Count of Day :"+ d.size());//to get size of list
		
		//selecting month
		WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		//creating object for an predefined class select
		Select month=new Select(monthelement);
		month.selectByVisibleText("SEP");
		List<WebElement> m=month.getOptions();
		System.out.println("Count of Month :" +m.size());
		
		//selecting year
		WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		//creating object for an predefined class select
		Select year=new Select(yearelement);
		year.selectByIndex(10);
		List<WebElement> y=year.getOptions();
		System.out.println("Count of Year :" +y.size());
		
		
	}

}
