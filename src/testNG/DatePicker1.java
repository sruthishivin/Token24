package testNG;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker1 {
	
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
	driver=new ChromeDriver();

	}
	@BeforeMethod
	public void url()
	{
	driver.manage().window().maximize();
	driver.get("https://www.trivago.com");

	}
	@Test
	public void testlogin()
	{
	driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]")).click();

	while (true)
	{
	WebElement month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
	String month1=month.getText();
	//System.out.println(month1);
	if(month1.equals("June 2024"))
	{
	System.out.println(month1);
	break;
	}
	else
	{

	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
	}


	}
	List<WebElement>aldate=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
	for(WebElement dates:aldate)
	{
	String date=dates.getText();
	System.out.println(date);
	if(date.equals("30"))
	{
	System.out.println(date);
	dates.click();
	System.out.println("date selected");
	break;

	}

	}

	}
	}




