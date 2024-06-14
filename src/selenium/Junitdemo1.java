package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo1 {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Browser open");
	}
	@Test
	public void test()
	{
		String actualtitle=driver.getTitle();//to get the title
		String expect="Google";
		if(actualtitle.equals(expect))//checking actual and expect are matching
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
		String expectcontent="Gmail";
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
		public void browserclose()
		{
			driver.close();
			System.out.println("Browser Close"); 
			
		}
	}

