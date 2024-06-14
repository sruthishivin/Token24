package selenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());//to get the counts(to getting the count here using size method)
		for(WebElement t:li)
		{
			String s=t.getAttribute("href");//to get the link
			String z=t.getText();//to get the text
			System.out.println(s+"------"+z);
			
		}
		
	}
}
