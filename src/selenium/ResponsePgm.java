package selenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponsePgm {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void set() {
		
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test() throws Exception
	{
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		int responsecode=con.getResponseCode();
		
		System.out.println(responsecode);
		con.connect();
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
