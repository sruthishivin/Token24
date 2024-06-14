package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultuipleResponseUsingMethod {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	@Test
	public void test()
	{
	
		List<WebElement> li = driver.findElements(By.tagName("a"));
		for(WebElement t:li)
		{
			String link=t.getAttribute("href");//to get the link
			verify(link);
		}	
	}
	
	public void verify(String link)
	{
		
		try
		{
				
			URL ob=new URL(link);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			
			if(con.getResponseCode()==200)
			{
				
				System.out.println("Valid-----"+link);
			}
			else if(con.getResponseCode()==404)
			{
				
				System.out.println("Invalid-----"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
