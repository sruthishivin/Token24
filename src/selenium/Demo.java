package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();//code for browser launch
		driver.get("https://www.google.com");//to open the url
		
		//Title verification
		
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
		
		//content verification
		
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
		
		//driver.close();//to close currently opened tab
		//driver.quit();//to close the entire tab

	}

}
