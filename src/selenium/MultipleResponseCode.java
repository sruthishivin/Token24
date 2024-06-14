package selenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleResponseCode {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() throws Exception
	{
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		int responsecode=con.getResponseCode();
		con.connect();
		List<WebElement> li = driver.findElements(By.tagName("a"));
		for(WebElement t:li)
		{
			String s=t.getAttribute("href");//to get the link
			System.out.println(s);
			if(responsecode==200)
			{
				System.out.println("valid");
			}
			else
			{
				System.out.println("Invalid");
			}
			
		}
	}
}
