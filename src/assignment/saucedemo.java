package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class saucedemo {
	
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.manage().window().maximize();
		//ChromeDriver chromeDriver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
	}
	@Test
	public void test()throws IOException
	{
		File f=new File("D:\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi) ;
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username = " +username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password = " +pswd);
			
			driver.findElement(By.id("user-name")).clear();
			driver.findElement(By.id("user-name")).sendKeys(username);
			//driver.navigate().refresh();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswd);
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			
			
			String actualurl=driver.getCurrentUrl();
			System.out.println(actualurl);
			//String expurl="https://www.saucedemo.com/v1/";
			String expurl="https://www.saucedemo.com/v1/inventory.html";

			if(expurl.equalsIgnoreCase(actualurl))
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("login unsuccessful");
			
				}
			
		}
		
	}
	

	}



