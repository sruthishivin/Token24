package selenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
	}
	@Test
	public void test()
	{
		
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day=new Select(dayelement);
		day.selectByValue("9");
		List<WebElement> d=day.getOptions();
		System.out.println("Count of the day :"+d.size());
		
		WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month=new Select(monthelement);
		month.selectByIndex(2);
		List<WebElement> m=month.getOptions();
		System.out.println("Count of the month :"+m.size());
		
		WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select year=new Select(yearelement);
		year.selectByVisibleText("2013");
		List<WebElement> y=year.getOptions();
		System.out.println("Count of the year :"+y.size());
	}
}
