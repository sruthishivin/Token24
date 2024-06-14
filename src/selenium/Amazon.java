package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void get()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expect="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(actualtitle.equals(expect))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	@Test
	public void test1()
	{
		String actualcontent=driver.getPageSource();//to get page source
		String expectcontent="Cart";
		if(actualcontent.contains(expectcontent))//to check one string in another string.
		{

			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}	
		
	}
	@After
	public void broswerclose()
	{
		driver.close();
		System.out.println("Close");
		//driver.quit();
	}
}
